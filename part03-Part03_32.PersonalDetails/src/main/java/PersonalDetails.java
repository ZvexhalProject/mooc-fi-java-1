
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longestName=0;
        String valueOfLongestName="";
        int sumBirthyear=0;
        int counter=0;

        while(true){
            String childrenAndBirthyear=scanner.nextLine();
            if(childrenAndBirthyear.isEmpty()){
                break;
            }
            String []birthSplit =childrenAndBirthyear.split(",");
            if(longestName<birthSplit[0].length()){
                longestName=birthSplit[0].length();
                valueOfLongestName=birthSplit[0];
            }
            sumBirthyear+=Integer.valueOf(birthSplit[1]);
            counter++;
        }
        System.out.println("Longest name: "+valueOfLongestName);
        System.out.println("Average of the birth years: "+(double)sumBirthyear/counter);

    }
}
