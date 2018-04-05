package mcmurchie;

import java.util.Scanner;

public class StudentProject {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            students[i] = createStudent();
        }
        System.out.println("Number of Students: " + Student.getNumStudents());
        students[0].addPoints(90);
        students[1].addPoints(890);
        students[2].addPoints(50);
        for (Student s : students) {
            displayStudent(s);
        }
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
