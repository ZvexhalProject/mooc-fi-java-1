
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest=0;
        String nameOfOldest="";
        while(true){
            String childrenAndAge=scanner.nextLine();
            if(childrenAndAge.isEmpty()){
                break;
            }
            String []ageSplit =childrenAndAge.split(",");
            if(oldest<Integer.valueOf(ageSplit[1])){
                oldest=Integer.valueOf(ageSplit[1]);
                nameOfOldest=ageSplit[0];
            }
        }
        System.out.println("Name of the oldest: "+nameOfOldest);

    }
}
