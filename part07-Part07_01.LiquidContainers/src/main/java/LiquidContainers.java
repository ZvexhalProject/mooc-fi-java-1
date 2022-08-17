import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amountContainer1=0;
        int amountContainer2=0;

        while (true) {
            System.out.println("First: "+amountContainer1+"/100");
            System.out.println("Second: "+amountContainer2+"/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String [] inputSplit=input.split(" ");
            if(inputSplit[0].equals("add")){
                if(amountContainer1+Integer.valueOf(inputSplit[1])>100){
                    amountContainer1=100;
                    continue;
                }
                if(Integer.valueOf(inputSplit[1])<0){
                    continue;
                }
                amountContainer1+=Integer.valueOf(inputSplit[1]);
            }

            if(inputSplit[0].equals("move")){
                if(amountContainer1-Integer.valueOf(inputSplit[1])<0){
                    amountContainer2+=amountContainer1;
                    amountContainer1=0;
                    continue;
                }
                amountContainer1-=Integer.valueOf(inputSplit[1]);
                
                if(amountContainer2+Integer.valueOf(inputSplit[1])>100){
                    amountContainer2=100;
                    continue;
                }
                amountContainer2+=Integer.valueOf(inputSplit[1]);
            }

            if(inputSplit[0].equals("remove")){
                if(amountContainer2-Integer.valueOf(inputSplit[1])<0){
                    amountContainer2=0;
                    continue;
                }
                if(Integer.valueOf(inputSplit[1])<0){
                    continue;
                }
                amountContainer2-=Integer.valueOf(inputSplit[1]);
            }


        }
    }

}
