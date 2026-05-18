import java.util.ArrayList;
import java.util.Scanner;

public class main{
    public static void main(String [] args){

        // create objects
        StudentDatabase std_Database= new StudentDatabase();
        FileManager fileHandler = new FileManager();
        StudentReportGenerator std_ReportGenerator= new StudentReportGenerator();
        Scanner input = new Scanner(System.in);

        // loop controller 
        boolean end = false;

        // run while the program is open
        while(!end){

            // print menu for the user to choose a service
            System.out.println("**************SERVICES**************");
            System.out.println("1- Search for a student");
            System.out.println("2- Add student");
            System.out.println("3- Update student");
            System.out.println("4- Remove student");
            System.out.println("5- Display all students");
            System.out.println("6- Save student data into file");
            System.out.println("7- Load student data from file");
            System.out.println("8- Generate report for a student");
            System.out.println("9- EXIT");
            System.out.println("please enter the number of the service: ");

            // take the input from the user
            int service = input.nextInt();
            input.nextLine();

            // used switch to handle all cases and better performance
            switch (service) {
                case 1:
                    // ask the user to enter the sstudent name
                    System.out.println("Enter the student name: ");
                    String name = input.nextLine();

                    // call meathod searchForStudent() by object std_DataBase
                    std_Database.searchForStudent(name);
                    break;
                case 2:
                    // take student informations from the user
                    System.out.println("enter student ID: ");
                    int id= input.nextInt();
                    input.nextLine();

                    System.out.println("enter student Name: ");
                    String Name = input.nextLine();

                    System.out.println("enter student Email: ");
                    String email = input.nextLine();

                    System.out.println("enter student phone number: ");
                    String phone = input.nextLine();

                    System.out.println("enter student acadamic year: ");
                    int year = input.nextInt();
                    input.nextLine();

                    System.out.println("enter student GPA: ");
                    double gpa =input.nextDouble();
                    input.nextLine();

                    System.out.println("enter student department: ");
                    String dept= input.nextLine();

                    // create StudentData array to store student informations
                    StudentData student= new StudentData(id, Name, email, phone, year, gpa, dept);
                    // call method addStudent() by std_Database object
                    std_Database.addStudent(student);
                    break;
                case 3:
                    // update the student informations using their id
                    System.out.println("enter student ID: ");
                    int stdId= input.nextInt();
                    input.nextLine();

                    // ask the user to enter the new informations
                    System.out.println("enter students new name: ");
                    String newName = input.nextLine();

                    System.out.println("enter students new email: ");
                    String newEmail = input.nextLine();

                    System.out.println("enter students new phone number: ");
                    String newNumber= input.nextLine();

                    System.out.println("enter students new acadamic year: ");
                    int newYear = input.nextInt();
                    input.nextLine();

                    System.out.println("enter students new GPA: ");
                    double newGpa= input.nextDouble();
                    input.nextLine();

                    System.out.println("enter students new department: ");
                    String newDept = input.nextLine();


                    // store the updated informations
                    StudentData updatedStudent = new StudentData(stdId, newName, newEmail
                                                , newNumber, newYear, newGpa, newDept);
                    // call method updateStudent() by std_Database object
                    std_Database.updateStudent(stdId, updatedStudent);
                    break;
                case 4:
                    // take the student id from the user to remove it
                    System.out.println("enter student ID that you want to remove: ");
                    int ID= input.nextInt();
                    input.nextLine();

                    // call method removeStudent() by std_Database object
                    std_Database.removeStudent(ID);
                    break;
                case 5:
                    System.out.println("*********STUDENTS DATABASE*********");
                    // call method displayStudents() by std_Database object
                    std_Database.displayStudents();
                    break;
                case 6:
                    /* create Arraylist<StudentData> object and store the
                       saved students data by calling method getStudents() by
                        std_Database object */ 
                    ArrayList<StudentData> showStudents= std_Database.getStudents();

                    // creates a thread for storing the student data into the file
                    SaveThread save= new SaveThread(fileHandler, showStudents);

                    // call method start() to save the thread
                    save.start();
                    break;
                case 7:
                    // to load students data from the file
                    ArrayList<StudentData> availableStudnets= fileHandler.load_From_File();

                    for (StudentData std: availableStudnets){
                        std_Database.addStudent(std);
                    }
                    break;
                case 8:

                    System.out.println("********GENERATE REPORTS********");
                    System.out.println("1- Show average GPA");
                    System.out.println("2- Count students");
                    System.out.println("3- Show students by departments");
                    System.out.println("4- Show top students");
                    System.out.println("please enter the number of the service: ");

                    // take the option from the user
                    int op= input.nextInt();
                    input.nextLine();

                // switch statements to hanlde options
                switch (op) {
                    case 1:
                        // call method showAverageGPA() by std_ReportGenerator object
                        std_ReportGenerator.showAverageGPA(std_Database.getStudents());
                        break;
                    case 2:
                        // call method countStudents() by std_ReportGenerator object
                        std_ReportGenerator.countStudents(std_Database.getStudents());
                        break;
                    case 3:
                        // take the department name from the user
                        System.out.println("enter the department name: ");
                        String deptName = input.nextLine();
                        // call method showStudentsByDepartment() by std_ReportGenerator object
                        std_ReportGenerator.showStudentsByDepartment(std_Database.getStudents(), deptName);
                        break;
                    case 4:
                        // call method showTopStudents() by std_ReportGenerator object
                        std_ReportGenerator.showTopStudents(std_Database.getStudents());
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }

                    break;

                case 9:
                    end= true;

                    System.out.println("End of the program");
                    break;
                default:
                    System.out.println("Invalid input");
            }


        }
    }
}