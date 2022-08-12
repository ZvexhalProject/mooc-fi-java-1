
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average=0;
        int counter=0;
        int sum=0;
        while(true){
            System.out.println("Give a number:");
            int number=Integer.valueOf(scanner.nextLine());

            if(number==0){
                break;
            }
            counter++;
            sum+=number;
        }
        average=(double) sum/counter;
        System.out.println("Average of the numbers: "+average);
    }
}
