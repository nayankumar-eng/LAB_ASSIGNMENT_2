import java.util.*;

abstract class Person {
    protected String name;
    protected String email;
    public Person() {}
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public abstract void displayInfo();
}

class Student extends Person {
    private int rollNo;
    private String course;
    private double marks;
    private char grade;

    public Student() {}
    public Student(int rollNo, String name, String email, String course, double marks) {
        super(name, email);
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
        calculateGrade();
    }

    public void displayInfo() {
        System.out.println("Student Info:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
    }

    public void displayInfo(boolean includeMarks) {
        System.out.println("Student Info:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        if (includeMarks) {
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + grade);
        }
    }

    private void calculateGrade() {
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 50) grade = 'C';
        else grade = 'D';
    }

    public int getRollNo() {
        return rollNo;
    }
}

interface RecordActions {
    void addStudent(Student s);
    void deleteStudent(int rollNo);
    void updateStudent(int rollNo, Student updated);
    Student searchStudent(int rollNo);
    void viewAllStudents();
}

class StudentManager implements RecordActions {
    private Map<Integer, Student> records = new HashMap<>();

    public void addStudent(Student s) {
        if (!records.containsKey(s.getRollNo())) records.put(s.getRollNo(), s);
    }

    public void deleteStudent(int rollNo) {
        records.remove(rollNo);
    }

    public void updateStudent(int rollNo, Student updated) {
        records.put(rollNo, updated);
    }

    public Student searchStudent(int rollNo) {
        return records.get(rollNo);
    }

    public void viewAllStudents() {
        for (Student s : records.values()) {
            s.displayInfo();
            System.out.println();
        }
    }
}

final class FinalNote {
    public final void display() {
        System.out.println("This is a final method in a final class.");
    }
    protected void finalize() {
        System.out.println("Finalize method called before object is garbage collected.");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student s1 = new Student(101, "Ankit", "ankit@mail.com", "B.Tech", 85);
        Student s2 = new Student(102, "Riya", "riya@mail.com", "M.Tech", 92);

        manager.addStudent(s1);
        manager.addStudent(s2);

        manager.viewAllStudents();

        System.out.println("[Note] Overloaded display method:");
        s1.displayInfo(true);

        FinalNote fn = new FinalNote();
        fn.display();
        fn = null;
        System.gc();
    }
}
