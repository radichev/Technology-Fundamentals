package TechModule.DataTypesAndVariablesExcersice;

import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowerBoreder = Integer.parseInt(scanner.nextLine());
        int upperBorder = Integer.parseInt(scanner.nextLine());

        for (int i = lowerBoreder; i <= upperBorder; i++) {
            char cast = (char) i;

            System.out.print(cast + " ");
        }
    }
}
