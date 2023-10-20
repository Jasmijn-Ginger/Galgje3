import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class InputUser {

    public static String getInputUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which letter do you want to guess? ");
        String input = scanner.next();
        return input.toUpperCase();
    }



}
