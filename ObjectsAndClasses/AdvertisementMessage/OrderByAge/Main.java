package TechModule.ObjectsAndClasses.AdvertisementMessage.OrderByAge;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")

        Scanner sc = new Scanner(System.in);
        String input = "";

        List<Person2> people = new ArrayList<>();

        while (!"End".equals(input = sc.nextLine())) {
            String[] data = input.split("\\s+");
            String name = data[0];
            String id = data[1];
            int age = Integer.parseInt(data[2]);

            Person2 person = new Person2(name, id, age);

            people.add(person);
        }

        people = people.stream().sorted(Comparator.comparingInt(Person2::getAge)).collect(Collectors.toList());

        for (Person2 person2 : people) {
            System.out.println(person2.toString());
        }
    }
}

