package TechModule.ObjectsAndClasses.AdvertisementMessage.Articles1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String[] data = scan.nextLine().split(",");
        Articles article = new Articles(data[0], data[1], data[2]); // създаваме нов обект от тип article с индексите от масива

        int n = Integer.parseInt(scan.nextLine());

        while (n-- > 0) {
            String[] tokens = scan.nextLine().split(":");
            String cammand = tokens[0];

            if (cammand.equals("Edit")) {
                article.edit(tokens[1]);
            } else if (cammand.equals("ChangeAuthor")) {
                article.changeAuthor(tokens[1]);
            } else {
                article.rename(tokens[1]);

            }
        }
        System.out.println(article.toString());// от коригираният масив изпринти метода от toString

    }
}