
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word:");
        String givenWord=scanner.nextLine();

        System.out.println(givenWord+givenWord+givenWord);
        // Write your program here

    }
}
