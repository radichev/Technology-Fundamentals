package TechModule.BasicSyntaxLab;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        if (country.equalsIgnoreCase("England")){
            System.out.println("English");
        }else if (country.equalsIgnoreCase("USA")){
            System.out.println("English");
        }else if (country.equalsIgnoreCase("Spain")) {
            System.out.println("Spanish");
        }else if (country.equalsIgnoreCase("Argentina")) {
            System.out.println("Spanish");
        }else if (country.equalsIgnoreCase("Mexico")) {
            System.out.println("Spanish");
        } else {
            System.out.printf("unknown");
        }
    }
}
