import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Container amountContainer1=new Container();
        Container amountContainer2=new Container();

        while (true) {
            System.out.println("First: "+amountContainer1);
            System.out.println("Second: "+amountContainer2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String [] inputSplit=input.split(" ");
            if(inputSplit[0].equals("add")){
                amountContainer1.add(Integer.valueOf(inputSplit[1]));
                continue;
            }

            if(inputSplit[0].equals("move")){
                int tempAmountC1=amountContainer1.contains();
                amountContainer1.remove(Integer.valueOf(inputSplit[1]));
                if(amountContainer1.contains()==0){
                    amountContainer2.add(tempAmountC1);
                    continue;
                }
                amountContainer2.add(Integer.valueOf(inputSplit[1]));
            }

            if(inputSplit[0].equals("remove")){
                amountContainer2.remove(Integer.valueOf(inputSplit[1]));
                continue;
            }
        }
    }
}
