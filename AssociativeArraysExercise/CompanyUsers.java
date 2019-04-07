package TechModule.AssociativeArraysExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, List<String>> theCompany = new TreeMap<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] command = input.split("\\s+->\\s+");

            String company = command[0];
            String id = command[1];

            if (!theCompany.containsKey(company)) {
                theCompany.put(company, new ArrayList<>());
                theCompany.get(company).add(id);
            } else {
                if (!theCompany.get(company).contains(id)) {
                    theCompany.get(company).add(id);
                }
            }
        }
        theCompany.entrySet()
                .forEach(e -> {
                    System.out.println(String.format("%s",
                            e.getKey()));
                    for (int i = 0; i < e.getValue().size(); i++) {
                        System.out.println("-- " + e.getValue().get(i));
                    }
                });

    }
}
