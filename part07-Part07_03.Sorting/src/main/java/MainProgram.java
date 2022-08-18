import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexSmallest = 0;
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i]==smallest){
                indexSmallest=i;
            }
        }
        return indexSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int []newTable= new int[table.length-startIndex];
        System.arraycopy(table, startIndex, newTable, 0, table.length-startIndex);
        return indexOfSmallest(newTable)+startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    public static void sort(int[]array) {
        for(int i=0; i<array.length;i++){
            swap(array, indexOfSmallestFrom(array,i),i );
            System.out.println(Arrays.toString(array));
        }
    }

}
