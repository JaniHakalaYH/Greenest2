package Program;
import GreenestOOP.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
public class Program extends UserInputAndHandling {

    protected List<Plant> plantsList;
    Program() {

        plantsList = new ArrayList<>(); //Skapa lista

        plantsList.add(new Cactus("igge", 0.2)); //Fyll lista med växter på Greenest
        plantsList.add(new Palm("Laura", 5.0));
        plantsList.add(new Carnivore("Meatloaf", 0.7));
        plantsList.add(new Palm("Putte", 1.0));

        askAndCalculate(plantsList); //Skicka in listan för kontroll och kalkylering
    }

}


