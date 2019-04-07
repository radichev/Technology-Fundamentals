package TechModule.TechMidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> paintingNumber =
                Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] command = input.split("\\s+");


            if (command[0].equalsIgnoreCase("Change")) {
                int number = Integer.parseInt(command[1]);
                if (paintingNumber.contains(number)) {
                    int index = paintingNumber.indexOf(number);
                    paintingNumber.set(index, Integer.parseInt(command[2]));
                }
            }
            if (command[0].equalsIgnoreCase("Hide")) {
                int number = Integer.parseInt(command[1]);
                int removeIndex = paintingNumber.indexOf(number);
                paintingNumber.remove(removeIndex);
            }
            if (command[0].equalsIgnoreCase("Switch")) {
                int number = Integer.parseInt(command[1]);
                if (paintingNumber.contains(number) && paintingNumber.contains(Integer.parseInt(command[2]))) {
                    int index1 = paintingNumber.indexOf(number);
                    int index2 = paintingNumber.indexOf(Integer.parseInt(command[2]));
                    paintingNumber.set(index1, Integer.parseInt(command[2]));
                    paintingNumber.set(index2, number);
                }
            }
            if (command[0].equalsIgnoreCase("Insert")) {
                int number = Integer.parseInt(command[1]);
                if (number >= 0 && number < paintingNumber.size()) {
                    paintingNumber.add(number + 1, Integer.parseInt(command[2]));
                }
            }
            if (command[0].equalsIgnoreCase("Reverse")) {
                Collections.reverse(paintingNumber);
            }
        }
        for (int i = 0; i < paintingNumber.size(); i++) {
            if (i == paintingNumber.get(i) - 1) {
                System.out.print(paintingNumber.get(i));
            } else {
                System.out.print(paintingNumber.get(i) + " ");
            }
        }
    }
}
