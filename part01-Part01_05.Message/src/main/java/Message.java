
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        //Create scanner
        Scanner scanner = new Scanner(System.in);

        //Print "Write a message"
        System.out.println("Write a message:");
        
        //Message-input is assigned to variable
        String message = scanner.nextLine();
        
        //Print out message input
        System.out.println(message);

    }
}
