import java.util.Scanner;

public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 1;
        while (i <= number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int i = 1;
        // part 1 of the exercise
        while (i <= number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        int j = size;
        while (i <= size) {
            printSpaces(j - 1);
            printStars(i);
            i++;
            j--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        // widest part of three= height*2-1
        // treetrunk always height-2 spaces
        int i = 1;
        int j = height;
        int trunk = 0;
        while (i <= height) {
            printSpaces(j - 1);
            printStars((i * 2) - 1);
            i++;
            j--;
        }
        while (trunk < 2) {
            printSpaces(height - 2);
            printStars(3);
            trunk++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);

        int test1 = 0;

        Scanner x = new Scanner(System.in);
        System.out.print("Customer number: ");
        int y = Integer.valueOf(x.nextLine());

        if (y >= 1000 && y % 25 == 0) {
            System.out.println("Gets a gift card!");
        } else if (y % 2000 == 0) {
            System.out.println("Gets a large gift card!");
        } else {
            System.out.println("Gets nothing.");
        }
    }
}
