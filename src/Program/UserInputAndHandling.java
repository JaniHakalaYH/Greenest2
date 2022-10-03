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
    public void test(List<Plant>plantList){
        while(true){
            String input = askForPlant();
            try{
                Plant plant = handleAnswer(input, plantList);
                JOptionPane.showMessageDialog(null,"Finns");
                plant.calculateNutrition();
                break;
            }catch(NoSuchElementException e){
                JOptionPane.showMessageDialog(null, "Finns ej i listan");
            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "glömde du input?");
            }
        }
    }
}//TestGithub