import java.io.IOException;
import java.util.Scanner;

public final class IDE {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        final String os = System.getProperty("os.name");
        if (os.contains("Windows"))
        {
            Runtime.getRuntime().exec("cls");
        }
        else
        {
            Runtime.getRuntime().exec("clear");
        }
    }
}

