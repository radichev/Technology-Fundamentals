package TechModule.AssociativeArraysExercise;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pairStudents = Integer.parseInt(scanner.nextLine());

        ConcurrentHashMap<String, List<Double>> score = new ConcurrentHashMap<>();
        LinkedHashMap<String, Double> average = new LinkedHashMap<>();

        for (int i = 0; i < pairStudents; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!score.containsKey(name)) {
                score.put(name, new ArrayList<>());
                score.get(name).add(grade);
            } else {
                score.get(name).add(grade);
            }
        }
        double sum = 0;
        for (var kvp : score.entrySet()) {
            for (int i = 0; i < kvp.getValue().size(); i++) {
                sum += kvp.getValue().get(i);
            }
            sum /= kvp.getValue().size();

            if (sum < 4.50) {
                score.remove(kvp.getKey());
            } else {
                average.put(kvp.getKey(), sum);
            }
            sum = 0;
        }
        average.entrySet().stream().sorted((e1, e2) -> {
            int sort = Double.compare(e2.getValue(), e1.getValue());
            if (sort == 0) {
                sort = e2.getKey().compareTo(e1.getKey());
            }
            return sort;
        }).forEach(e -> {
            System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue());
        });
    }
}
