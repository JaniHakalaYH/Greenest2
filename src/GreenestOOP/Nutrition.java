package GreenestOOP;

public enum Nutrition {
    CACTUS ("mineralvatten",0.02),
    CARNIVORE ("proteindryck",0.2),
    PALM ("kranvatten",0.5);

    public final double value;
    public final String typeOfFood;
    Nutrition(String a, double b){
        value = b;
        typeOfFood = a;
    }
}
