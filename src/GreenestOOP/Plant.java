package GreenestOOP;
/*abstract superklass då vi inte instansierar objekt här
* implementerat interface*/
public abstract class Plant implements PlantInterface{
    //protected då vi vill nå dessa instansvariabler från subklasser.
    protected String type; //Enum
    protected double nutrition; //Enum
    protected String name;
    protected double height;
    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }
    //Från interface
    @Override
    public void calculateNutrition() {
    }
}
