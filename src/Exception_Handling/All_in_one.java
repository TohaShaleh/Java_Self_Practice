package Exception_Handling;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class All_in_one {
    public static void main(String[] args) {
        FileReader fr=null;

        try {
            fr = display();
            // Do something with fr if needed, like reading content
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found: " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println("IO error: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("General exception: " + e.getMessage());
        }
    }

    public static FileReader display() throws FileNotFoundException {
        FileReader fr = new FileReader("all_in_one.txt");
        System.out.println("File opened successfully.");
        return fr;
    }
}
