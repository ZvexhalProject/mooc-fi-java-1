
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("File to read:");
            String file=scanner.nextLine();

            UserInterface ui=new UserInterface(file);
            ui.start();
        }
    }

}
