import java.util.ArrayList;

public class StudentDatabase {
    // List to store StudentData objects created by your teammate
    private ArrayList<StudentData> students;

    // Constructor to initialize the list
    public StudentDatabase() {
        this.students = new ArrayList<>();
    }

    // Method to add a new student
    public void addStudent(StudentData student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    // Method to remove a student
    public void removeStudent(StudentData student) {
        if (students.remove(student)) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Method to update student data
    public void updateStudent(int index, StudentData updatedStudent) {
        if (index >= 0 && index < students.size()) {
            students.set(index, updatedStudent);
            System.out.println("Student data updated.");
        }
    }

    // Method to search for a student by checking their data
    public void searchForStudent(String name) {
        for (StudentData s : students) {
            // Using toString to check if the student name exists
            if (s.toString().toLowerCase().contains(name.toLowerCase())) { 
                System.out.println("Student found: " + s);
                return;
            }
        }
        System.out.println("No matching student found.");
    }

    // Method to display all students in the database
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("The student database is currently empty.");
        } else {
            for (StudentData s : students) {
                System.out.println(s);
            }
        }
    }
}
