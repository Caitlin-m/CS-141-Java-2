package mcmurchie;

public class Course {

    private String instructor;
    private Student[] students;

    public Course(String instructor, Student[] students) {
        this.instructor = instructor;
        this.students = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            this.students[i] = new Student(students[i].getLastName(),
                    students[i].getFirstName(), students[i].SID);
        }
    }

}
