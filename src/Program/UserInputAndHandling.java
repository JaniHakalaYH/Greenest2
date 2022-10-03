package Program;
import GreenestOOP.*;
import javax.swing.*;
import java.util.List;
import java.util.NoSuchElementException;

public class UserInputAndHandling {

    public String askForPlant() {
        return JOptionPane.showInputDialog(null, "Vilken växt vill du vattna");
    }
    public Plant handleAnswer(String answer, List<Plant> plantList) {
        for (Plant plant : plantList) {
            if (answer.equalsIgnoreCase(plant.getName())) {
                return plant;
            }
        }
        throw new NoSuchElementException();
    }
    public void askAndCalculate(List<Plant>plantList){
        while(true){
            String input = askForPlant();
            try{
                Plant plant = handleAnswer(input, plantList);
                plant.calculateNutrition();
                break;
            }catch(NoSuchElementException e){
                JOptionPane.showMessageDialog(null, "Skriv in ett giltigt namn");
            }catch(NullPointerException e){
                System.exit(0);
            }
        }
    }
}