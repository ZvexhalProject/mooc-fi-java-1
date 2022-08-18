import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        Main.sort(array);
        System.out.println(Arrays.toString(array));

        String[]arrayString={"f","g","i","a","d","c","eis"};
        Main.sort(arrayString);
        System.out.println(Arrays.toString(arrayString));

        ArrayList<Integer>listInt=new ArrayList<>();
        listInt.add(25);
        listInt.add(4);
        listInt.add(23);
        listInt.add(1);
        listInt.add(99);
        listInt.add(20000);
        Main.sortIntegers(listInt);
        System.out.println(listInt);

        ArrayList<String>listString=new ArrayList<>();
        listString.add("25");
        listString.add("a");
        listString.add("eis");
        listString.add("g");
        listString.add("zz");
        listString.add("z");
        Main.sortStrings(listString);
        System.out.println(listString);

    }

    public static void sort(int[] array){
        Arrays.sort(array);
    }

    public static void sort(String[] array){
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
        
    }
}
