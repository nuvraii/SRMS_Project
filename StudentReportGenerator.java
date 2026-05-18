import java.util.ArrayList;

public class StudentReportGenerator {

    // Show the student with highest GPA
    public void showTopStudents(ArrayList<StudentData> students) {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        StudentData topStudent = students.get(0);

        for (StudentData s : students) {
            if (s.getGpa() > topStudent.getGpa()) {
                topStudent = s;
            }
        }

        System.out.println("---- Top Student ----");
        System.out.println(topStudent);
    }

    // Show students from specific department
    public void showStudentsByDepartment(ArrayList<StudentData> students, String department) {

        boolean found = false;

        for (StudentData s : students) {
            if (s.getDepartment().equalsIgnoreCase(department)) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No students found in this department.");
            
        }
    }

    // Count all students
    public void countStudents(ArrayList<StudentData> students) {
        System.out.println("Total Students: " + students.size());
    }

    // Calculate average GPA
    public void showAverageGPA(ArrayList<StudentData> students) {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        double total = 0;

        for (StudentData s : students) {
            total += s.getGpa();
        }

        double average = total / students.size();

        System.out.println("Average GPA: " + average);
    }
}
