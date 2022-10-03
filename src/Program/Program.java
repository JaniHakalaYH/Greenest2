package Program;
import GreenestOOP.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
public class Program extends UserInputAndHandling {

    protected List<Plant> plantsList;
    Program() {

        plantsList = new ArrayList<>();

        plantsList.add(new Cactus("igge", 0.2));
        plantsList.add(new Palm("Laura", 5.0));
        plantsList.add(new Carnivore("Meatloaf", 0.7));
        plantsList.add(new Palm("Putte", 1.0));

        test(plantsList);
    }

}


