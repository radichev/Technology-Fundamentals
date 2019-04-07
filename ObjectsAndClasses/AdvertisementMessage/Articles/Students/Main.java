package TechModule.ObjectsAndClasses.AdvertisementMessage.Articles.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = Integer.parseInt(scanner.nextLine());

        List<data> studentsList = new ArrayList<>();

        for (int i = 0; i < numStudents; i++) {
            String[] studentsData = scanner.nextLine().split("\\s+");
            String firstName = studentsData[0];
            String lastName = studentsData[1];
            double grade = Double.parseDouble(studentsData[2]);

            data studentAdded = new data(firstName, lastName, grade);
            studentsList.add(studentAdded);

        }

        studentsList
                .stream()
                .sorted((p1, p2) -> Double.compare(p2.getGrade(), p1.getGrade()))
                .forEach(e -> {
                    System.out.println(e.toString());
                });
    }
}
