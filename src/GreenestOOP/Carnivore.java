package GreenestOOP;
import javax.swing.*;

public class Carnivore extends Plant{ //ärver från plant

    private final double baseNutrition; //används endast här och är konstant
    public Carnivore(String name, double height) {
        super(name, height);
        this.nutrition = Nutrition.CARNIVORE.value;
        this.baseNutrition = 0.1;
        this.type = Nutrition.CARNIVORE.typeOfFood;
    }
    @Override //Från interface och är även exempel på polymorfism
    public void calculateNutrition() {
        JOptionPane.showMessageDialog(null, "Karnivoren "+this.name+" behöver "+ (this.baseNutrition+this.nutrition*this.height)+" liter "+this.type+" per dag");
    }
}
