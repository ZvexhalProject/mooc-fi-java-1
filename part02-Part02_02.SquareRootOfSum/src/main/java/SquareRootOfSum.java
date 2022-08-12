
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberToBeRooted=Integer.valueOf(scanner.nextLine());
        int numberToBeRootedTwo=Integer.valueOf(scanner.nextLine());

        System.out.println(Math.sqrt(numberToBeRooted+numberToBeRootedTwo));
    }
}
