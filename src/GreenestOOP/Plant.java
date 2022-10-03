package GreenestOOP;

public class Plant implements PlantInterface{

    protected String name;
    protected double height;

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    @Override
    public void calculateNutrition() {
    }
}
