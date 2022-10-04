package GreenestOOP;
import javax.swing.*;

public class Palm extends Plant{ //ärver från plant

    public Palm(String name, double height) {
        super(name, height);
        this.nutrition = Nutrition.PALM.value;
        this.type = Nutrition.PALM.typeOfFood;
    }

    @Override //Från interface och är även exempel på polymorfism
    public void calculateNutrition() {
        JOptionPane.showMessageDialog(null,"Palmen "+this.name+" behöver "+this.nutrition*this.height+" liter "+this.type+" per dag");
    }
}
