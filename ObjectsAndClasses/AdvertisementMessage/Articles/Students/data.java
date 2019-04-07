package TechModule.ObjectsAndClasses.AdvertisementMessage.Articles.Students;

public class data {
    private String firstName;
    private String lastName;
    private double grade;

    data(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f", this.getFirstName(), this.getLastName(), this.getGrade());
    }
}
