
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest=0;
        while(true){
            String childrenAndAge=scanner.nextLine();
            if(childrenAndAge.isEmpty()){
                break;
            }
            String []ageSplit =childrenAndAge.split(",");
            if(oldest<Integer.valueOf(ageSplit[1])){
                oldest=Integer.valueOf(ageSplit[1]);
            }
        }
        System.out.println("Age of the oldest: "+oldest);

    }
}
