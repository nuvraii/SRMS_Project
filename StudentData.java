// allow the StudentData objects to be saved in a file
import java.io.Serializable;
public class StudentData extends User implements Serializable {

    // ATTRIBUTES
    private int year;
    private double gpa;
    private String department;

    //METHODS
    // DEFUALT CONSTRUCTOR:
    public StudentData(){
        // call parent defualt constructor
        super();

        // set defualt values for the current "child" class attributes
        this.year= 2026;
        this.gpa = 0.00;
        this.department= "Unknown";
    }

    // PARAMETERIZE CONSTRUCTOR:
    public StudentData(int id, String name, String emailAddress, String phoneNumber,
        int year, double gpa, String department){

        // call parent parameterize constructor
        super(id, name, emailAddress, phoneNumber);

        this.year = year;
        this.gpa= gpa;
        this.department = department;
    }

    // Setters:
    public void setYear(int year){
        this.year = year;
    }
    public void setGPA(double gpa){
        this.gpa= gpa;
    }
    public void setDepartment(String department){
        this.department= department;
    }

    // Getters
    public int getYear(){
        return year;
    }
    public double getGpa(){
        return gpa;
    }
    public String getDepartment(){
        return department;
    }


    // override method toString() to display the student data:
    @Override
    public String toString(){
        return "---- Student Informations ----\n" +
                super.toString() +
                "Year : "+ getYear() + "\n" +
                "GPA : "+ getGpa() + "\n" +
                "Department : "+ getDepartment() + "\n" +
                "_______________________________";    }
}