
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input=scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            String [] inputSplit=input.split(" ");
            for(String part:inputSplit){
                if(part.contains("av")){
                    System.out.println(part);;
                }
            }
        }

    }
}
