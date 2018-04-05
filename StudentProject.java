package mcmurchie;

import java.util.Scanner;

public class StudentProject {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Number of Students: " + Student.getNumStudents());
        Student student1 = new Student("Flintstone", " Fred", 789456123);
        Student student2 = new Student("Butterfly", " Star", 123456789);
        Student student3 = new Student("Barnes", " Bucky", 123456123);
        student1.addPoints(90);
        student2.addPoints(100);
        student3.addPoints(50);
        displayStudent(student1);
        displayStudent(student2);
        displayStudent(student3);
    }

    public static void displayStudent(Student s) {
        System.out.println(s.getName() + " has " + s.getPoints()
                + " points");
    }

    public static Student createStudent() {
        System.out.println("SID: ");
        int sid = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Last name: ");
        String lastName = scanner.nextLine();
        System.out.println("First name: ");
        String firstName = scanner.nextLine();
        Student s = new Student(lastName, firstName, sid);
        return s;
    }
}
