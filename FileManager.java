import java.io.*;
import java.util.ArrayList;

public class FileManager {
    private String fileName = "students_records.txt";

    // Method to save the current student list to a file
    public void save_To_File(ArrayList<StudentData> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
            System.out.println("All data has been saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error while saving: " + e.getMessage());
        }
    }

    // Method to load the student list back from the file
    public ArrayList<StudentData> load_From_File() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            ArrayList<StudentData> loadedData = (ArrayList<StudentData>) ois.readObject();
            System.out.println("Data loaded successfully.");
            return loadedData;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File is empty or could not be loaded.");
            return new ArrayList<>();
        }
    }
}
