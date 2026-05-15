import java.util.ArrayList;

public class StudentDatabase {
    // List to store student records
    private ArrayList<StudentData> students;

    // Constructor to initialize the database
    public StudentDatabase() {
        this.students = new ArrayList<>();
    }

    // Adds a new student to the list
    public void addStudent(StudentData student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    // Removes a student using their unique ID
    public void removeStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Student with ID " + id + " removed successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Updates student information using their ID
    public void updateStudent(int id, StudentData updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.set(i, updatedStudent);
                System.out.println("Student data for ID " + id + " updated.");
                return;
            }
        }
        System.out.println("No student found with ID " + id);
    }

    // Searches for a student specifically by their Name
    public void searchForStudent(String name) {
        for (StudentData s : students) {
            // Updated to search by getName() as requested
            if (s.getName().toLowerCase().contains(name.toLowerCase())) { 
                System.out.println("Student found: " + s);
                return;
            }
        }
        System.out.println("No matching student found.");
    }

    // Displays all students in the database
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


