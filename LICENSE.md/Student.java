package mcmurchie;

public class Student {

    final private int SID;
    private String lastName;
    private String firstName;
    private int points = 0;
    private static int numStudents;
    
    public Student(){
        SID = 0;
        numStudents++;
    }
    
    public Student(int studentID){
        SID = studentID;
        numStudents++;
    }

    public Student(String lastName, String firstName, int studentID) {
        SID = studentID;
        this.lastName = lastName;
        this.firstName = firstName;
        numStudents++;

    }

    public String getName() {
        return lastName + "," + firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void addPoints(int newPoints) {
        points += newPoints;
    }

    public int getPoints() {
        return points;
    }

    public static int getNumStudents() {
        return numStudents;
    }

}

