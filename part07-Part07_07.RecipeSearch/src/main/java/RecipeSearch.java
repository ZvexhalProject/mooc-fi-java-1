
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String file = scanner.nextLine();

        UserInterface ui = new UserInterface(file);
        ui.start();
        ui.printCommands();
       

        while (true) {
            System.out.println("\nEnter command:");

            String input = scanner.nextLine();
            if (input.equals("stop")) {
                scanner.close();
                break;
            }
            if (input.equals("list")) {
                ui.listRecipes();
            }

            if (input.equals("find name")) {
                System.out.println("\nSearched word:");
                String inputSearch = scanner.nextLine();

                System.out.println("\nRecipes:");
                ui.findRecipes(inputSearch);
            }

            if (input.equals("find cooking time")) {
                System.out.println("\nMax cooking time:");
                int maxCookingDuration = Integer.valueOf(scanner.nextLine());

                System.out.println("\nRecipes:");
                ui.findCookingTime(maxCookingDuration);
            }

            if (input.equals("find ingredient")) {
                System.out.println("\nIngredient");
                String searchIngredient = scanner.nextLine();

                System.out.println("\nRecipes:");
                ui.findIngredient(searchIngredient);
            }
        }

    }

}
