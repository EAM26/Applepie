import java.util.ArrayList;

public class PieRecipe {

    private static ArrayList<Ingredient> ingredients = new ArrayList<>();
    private static ArrayList<String> steps = new ArrayList<>();

    private String name;

    public void addStep(String step) {
        steps.add(step);
    }

    public void showSteps() {
        System.out.println("\nSTEPS\n");
        for (int i = 0; i < steps.size(); i++) {
            System.out.println(i+1 + ". " + steps.get(i));
        }
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void showIngredients() {
        System.out.println("\nINGREDIENTS\n");
        for (int i = 0; i < ingredients.size(); i++) {
            System.out.println(i+1 + ". " + ingredients.get(i).getName());
        }
    }

    public static ArrayList getIngredients() {
        return ingredients;
    }

    public static ArrayList getSteps() {
        return steps;
    }


    public String getName() {
        return name;
    }

    public PieRecipe(String name) {
        this.name = name;
    }
}
