
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int number = 0;
        int sum = 0;
        int counterNumbers = 0;
        double average = 0;
        int counterEven = 0;
        int counterOdd = 0;
        while (true) {
            number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }

            counterNumbers++;
            sum += number;
        }
        average = ((double) sum / counterNumbers);

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counterNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + counterEven);
        System.out.println("Odd: " + counterOdd);

    }
}
