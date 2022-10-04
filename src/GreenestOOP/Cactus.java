package GreenestOOP;
import javax.swing.*;

public class Cactus extends Plant{ //ärver från plant


    public Cactus(String name, double height) {
        super(name, height);
        this.nutrition = Nutrition.CACTUS.value;
        this.type = Nutrition.CACTUS.typeOfFood;
    }
    @Override //Från interface och är även exempel på polymorfism
    public void calculateNutrition() {
        JOptionPane.showMessageDialog(null,"Kaktusen "+this.name+" behöver "+ this.nutrition +" liter "+ this.type + " per dag");
    }
}
