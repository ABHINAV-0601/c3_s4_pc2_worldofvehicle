package data;

public class CNGEngines extends Engine{
    private String typeOfFuel;

    public CNGEngines(String modelNo, double maxPower, int maxRPM, int noOfCylinders, String typeOfFuel) {
        super(modelNo, maxPower, maxRPM, noOfCylinders);
        this.typeOfFuel = typeOfFuel;
    }
    public String getTypeOfFuel() {
        return typeOfFuel;
    }
    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public void display() {
        System.out.println("CNG Engine Details");
        super.display();
        System.out.println("typeOfFuel = " + typeOfFuel);
    }
}
