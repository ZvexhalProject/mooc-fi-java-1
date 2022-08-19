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

    public void printCommands() {
        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipe");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find cooking time - searches recipes by ingredient");
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



    }

    public void findIngredient(String searchIngredient) {
        for (Recipe recipe : recipes) {
            for (String recipeIngredient : recipe.getIngredients()) {
                if (searchIngredient.contains(recipeIngredient)) {
                    System.out.println(recipe);
                }
            }
        }
    }

    public void findCookingTime(int maxCookingDuration) {
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxCookingDuration) {
                System.out.println(recipe);
            }
        }
    }

    public void findRecipes(String inputSearch) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(inputSearch)) {
                System.out.println(recipe);
            }
        }
    }

    public void listRecipes() {
        System.out.println();
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

}
