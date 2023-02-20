public class Ingredient {

    private String name;
    private double amount;
    private String unit;

    public Ingredient(){
    }

    public Ingredient(double amount, String unit, String name) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }



    public String getName() {
        return name;
    }


    public double getAmount() {
        return amount;
    }


    public String getUnit() {
        return unit;
    }


}
