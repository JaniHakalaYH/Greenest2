package GreenestOOP;
import javax.swing.*;

public class Palm extends Plant implements PlantInterface{

    public Palm(String name, double height) {
        super(name, height);
    }

    @Override
    public void calculateNutrition() {
        double nutrition = 0.5;
        String typeOfNutrition = "kranvatten";
        JOptionPane.showMessageDialog(null,"Palmen "+this.name+" behöver "+nutrition*this.height+" liter "+typeOfNutrition+" per dag");
    }
}
