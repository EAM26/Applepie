import java.util.ArrayList;
// Class only for set Applepie. For other pies, use PieRecipe

public class ApplePieRecipe {

    // List of all ingredients from README file
    private String[] readMeIngredients = {"200 gram ongezouten roomboter"
            ,"200 gram witte bastard suiker"
            , "400 gram zelfrijzend bakmeel"
            , "1 stuk(s) ei"
            , "8 gram vanillesuiker"
            , "1 snuf zout"
            , "1.5 kilo zoetzure appels"
            , "75 gram kristal suiker"
            , "3 theelepels kaneel"
            , "15 gram paneermeel"
    };

    private String readMeSteps = " Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte) - Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart. - Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen. - Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel. - Vet de springvorm in en bestrooi deze met bloem - Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op. - Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneelsuiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneelsuiker mengsel en leg deze in de vorm. - Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed. - Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken - Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.";




    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    // Populates steps from readMeSteps
    private String[] steps = readMeSteps.split("-");

    // Constructor
    public ApplePieRecipe() {
        // Populates ingredients from readMeIngredients
        for (int i = 0; i < readMeIngredients.length; i++) {
            String[] item = readMeIngredients[i].split(" ", 3);
            ingredients.add(new Ingredient(Double.parseDouble(item[0]), item[1], item[2]));
        }
    }

    public void printIngredients() {
        System.out.println("\nINGREDIENTS:\n");
        for (Ingredient ingredient: ingredients
             ) {
            System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " +
                    ingredient.getName());
        }
    }

    public void printSteps() {
        System.out.println("\nSTEPS\n");
        int i = 1;
        for (String step: steps
             ) {
            System.out.println(i + ". " + step);
            i++;
        }
    }
}
