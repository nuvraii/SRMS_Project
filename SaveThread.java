import java.util.ArrayList;

public class SaveThread extends Thread {

    private FileManager fileManager;
    private ArrayList<StudentData> students;

    // Constructor
    public SaveThread(FileManager fileManager, ArrayList<StudentData> students) {

        this.fileManager = fileManager;
        this.students = students;
    }

    // Thread taskf
    @Override
    public void run() {

        fileManager.save_To_File(students);

        System.out.println("Data saved using thread successfully.");
    }
}