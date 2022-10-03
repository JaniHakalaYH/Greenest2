package GreenestOOP;
import javax.swing.*;

public class Carnivore extends Plant implements PlantInterface{

    public Carnivore(String name, double height) {
        super(name, height);
    }
    @Override
    public void calculateNutrition() {
        String typeOfNutrition = "proteindryck";
        double nutrition = 0.2;
        double baseNutrition = 0.1;
        JOptionPane.showMessageDialog(null, "Karnivoren "+this.name+" behöver "+ (baseNutrition+(nutrition*this.height))+" liter "+typeOfNutrition+" per dag");
    }
}
