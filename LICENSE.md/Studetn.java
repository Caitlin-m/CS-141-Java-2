package mcmurchie;

public class Student {

    final private int SID;
    private String lastName;
    private String firstName;
    private static int numStudents;
    private int points = 0;

    public Student(String lastName, String firstName, int studentID) {
        SID = studentID;
        this.lastName = lastName;
        this.firstName = firstName;
        numStudents++;
        
    }
}
