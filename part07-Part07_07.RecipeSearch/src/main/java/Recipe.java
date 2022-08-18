import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime){
        this.ingredients=new ArrayList<>();
        this.name=name;
        this.cookingTime=cookingTime;
    }

    public void addIngredient(String ingredient){
        if(!(this.ingredients.contains(ingredient))){
            this.ingredients.add(ingredient);
        }
    }

    public String getName(){
        return this.name;
    }

    public int getCookingTime(){
        return this.cookingTime;
    }

    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }

    @Override
    public String toString() {
        return this.name+", cooking time: "+this.cookingTime;
    }
}
