package GreenestOOP;
import javax.swing.*;

public class Cactus extends Plant implements PlantInterface{


    public Cactus(String name, double height) {
        super(name, height);

    }
    @Override
    public void calculateNutrition() {
        String typeOfNutrition = "mineralvatten";
        double nutrition = 0.02;
        JOptionPane.showMessageDialog(null,"Kaktusen "+this.name+" behöver "+ nutrition +" liter "+ typeOfNutrition + " per dag");
    }
}
