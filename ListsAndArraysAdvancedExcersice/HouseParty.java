package TechModule.ListsAndArraysAdvancedExcersice;

import java.util.ArrayList;
import java.util.Scanner;


public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());

        ArrayList<String> peopleGoing = new ArrayList<>();

        for (int i = 0; i < peopleCount; i++) {
            String[] input = scanner.nextLine().split(" ");
        String name = input[0];
            if (input.length == 3) {
                if (peopleGoing.contains(name)) {
                    System.out.printf("%s is already in the list!\n", name);
                    continue;
                }
                peopleGoing.add(name);
            } else if (input.length == 4) {
               if (peopleGoing.contains(name)) {
                   peopleGoing.remove(name);
               } else {
                   System.out.printf("%s is not in the list!\n", name);
               }
            }
        }
        for (int i = 0; i < peopleGoing.size(); i++) {
            System.out.println(peopleGoing.get(i));
        }
    }
}
