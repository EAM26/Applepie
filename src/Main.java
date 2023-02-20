public class Main {
    public static void main(String[] args) {


        ApplePieRecipe pie = new ApplePieRecipe();
        pie.printIngredients();
        pie.printSteps();


        // Pierecipe class for other cakes
        PieRecipe carrotCake = new PieRecipe("Carrot cake");
        carrotCake.addIngredient(new Ingredient(1, "kilograms", "carrots"));
        carrotCake.addIngredient(new Ingredient(100, "grams", "bakingpowder"));


        carrotCake.addStep("Buy carrots");
        carrotCake.addStep("Warm up oven");

        carrotCake.showSteps();
        carrotCake.showIngredients();
    }
}