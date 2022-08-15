
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> itemList = new ArrayList<>();

        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier=scanner.nextLine();
            if(identifier.isEmpty()){
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name=scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            Items newItem=new Items(identifier, name);
            if(!(itemList.contains(newItem))){
                itemList.add(newItem);
            }
        }
        System.out.println("==Items==");
        for(Items item:itemList){
            System.out.println(item);
        }

    }
}
