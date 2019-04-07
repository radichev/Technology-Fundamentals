package TechModule.AssociativeArraysExercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Map<String, List<Double>> products = new LinkedHashMap<>();

        while (!"buy".equals(input[0])) {
            String name = input[0];
            double price = Double.parseDouble(input[1]);
            double quantity = Double.parseDouble(input[2]);

            if (!products.containsKey(name)) {
                products.put(name, new ArrayList<>());
                products.get(name).add(price);
                products.get(name).add(quantity);
            } else {
                products.get(name).set(1, products.get(name).get(1) + quantity);
                products.get(name).set(0, price);

            }

            input = scanner.nextLine().split("\\s+");
        }

        for (Map.Entry<String, List<Double>> kvp : products.entrySet()) {
            kvp.getValue().set(0, kvp.getValue().get(0) * kvp.getValue().get(1));
        }

        products
                .entrySet()
                .forEach(e -> System.out.println(String.format("%s -> %.2f",
                        e.getKey(),
                        e.getValue().get(0))));
    }
}