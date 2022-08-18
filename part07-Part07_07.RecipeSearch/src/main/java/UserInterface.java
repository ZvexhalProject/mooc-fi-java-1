import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner fileScanner;
    private ArrayList<Recipe> recipes;

    public UserInterface(String file) {
        this.recipes = new ArrayList<>();

        try {
            this.fileScanner = new Scanner(Paths.get(file));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public void start() {
        while (fileScanner.hasNextLine()) {
            String recipeName = fileScanner.nextLine();
            int cookingTime = Integer.valueOf(fileScanner.nextLine());
            Recipe newRecipe = new Recipe(recipeName, cookingTime);
            String ingredient = fileScanner.nextLine();
            while (!(ingredient.isEmpty())) {
                newRecipe.addIngredient(ingredient);
                if (fileScanner.hasNextLine()) {
                    ingredient = fileScanner.nextLine();
                } else {
                    ingredient = "";
                }
            }
            this.recipes.add(newRecipe);
        }

        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipe");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find cooking time - searches recipes by ingredient");

        Scanner inputScanner = new Scanner(System.in);
        while (true) {

            System.out.println("\nEnter command:");

            String input = inputScanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            if (input.equals("list")) {
                System.out.println();
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }

            if (input.equals("find name")) {
                System.out.println("\nSearched word:");
                String inputSearch = inputScanner.nextLine();

                System.out.println("\nRecipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(inputSearch)) {
                        System.out.println(recipe);
                    }
                }
            }

            if (input.equals("find cooking time")) {
                System.out.println("\nMax cooking time:");
                int maxCookingDuration = Integer.valueOf(inputScanner.nextLine());

                System.out.println("\nRecipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getCookingTime() <= maxCookingDuration) {
                        System.out.println(recipe);
                    }
                }
            }

            if (input.equals("find ingredient")) {
                System.out.println("\nIngredient");
                String searchIngredient = inputScanner.nextLine();

                System.out.println("\nRecipes:");
                for (Recipe recipe : recipes) {
                    for(String recipeIngredient:recipe.getIngredients()){
                        if(searchIngredient.contains(recipeIngredient)){
                            System.out.println(recipe);
                        }
                    }
                }
            }
        }

    }

}
