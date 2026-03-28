import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class Week1_2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Please Enter a password");

            String passcode = sc.nextLine();

            boolean hasNumber = passcode.matches(".*[0-9]*.");
            boolean hasLetter = passcode.matches(".*[a-z][A-z]*.");
            boolean hasSpecial = passcode.matches("");
        }
    }
}
