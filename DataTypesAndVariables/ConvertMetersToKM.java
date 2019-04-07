package TechModule.DataTypesAndVariables;

import java.util.Scanner;

public class ConvertMetersToKM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        double toKm = num / 1000.0;
        System.out.println( String.format("%.2f", toKm));
    }
}
