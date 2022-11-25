import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public final class FileIOJava {
    public static void main(String[] args) throws FileNotFoundException {
        File newFile = new File("hello.txt");
        String toWrite = "Hi my name is Devashish Roy.\nSo this really works Huh.\nDid this work? Yes it Did.";

        /* Creating and Writing to a File */
        try (FileWriter file = new FileWriter(newFile)){
            file.write(toWrite);

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        /* Reading from a file */
        try (Scanner read = new Scanner(newFile)) {
            while (read.hasNextLine()) {
                System.out.println(read.nextLine());
            }
        }
    }
}

