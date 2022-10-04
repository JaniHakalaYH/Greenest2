package Program;
import GreenestOOP.*;
import javax.swing.*;
import java.util.List;
import java.util.NoSuchElementException;

public class UserInputAndHandling {

    public String userInput() { //Tar in user input
        return JOptionPane.showInputDialog(null, "Vilken växt vill du vattna");
    }
    public Plant handleAnswer(String input, List<Plant> plantList) { //kontrollerar om input finns i listan returnerar ett objekt
        for (Plant plant : plantList) {
            if (input.equalsIgnoreCase(plant.getName())) {
                return plant;
            }
        }throw new NoSuchElementException();
    }
    public void askAndCalculate(List<Plant>plantList){
        while(true){
            String input = userInput(); //Ta in input
            try{
                Plant plant = handleAnswer(input, plantList); //gå igenom listan och kolla om objektet finns
                plant.calculateNutrition(); //kalkylera och skriv ut svaret
                break;
            }catch(NoSuchElementException e){ //Om orelevant input eller tomt input slås in
                JOptionPane.showMessageDialog(null, "Skriv in ett giltigt namn");
            }catch(NullPointerException e){ //Om användare klickar "Cancel" eller "X"
                System.exit(0);
            }
        }
    }
}