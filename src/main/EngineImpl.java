package main;

import data.CNGEngines;
import data.DieselEngines;
import data.ElectricEngines;
import data.PetrolEngines;

public class EngineImpl {
    public static void main(String[] args) {
        PetrolEngines petrolEngine = new PetrolEngines("K195B5",37.5,2500,100,4,"Petrol");
        System.out.println("Petrol Engine Details");
        petrolEngine.display();
        System.out.println();
        DieselEngines dieselEngine = new DieselEngines("Q135D5",45.5,2000,120,4,"Diesel");
        System.out.println("Diesel Engine Details");
        dieselEngine.display();
        System.out.println();
        CNGEngines cngEngine = new CNGEngines("P125F5",40.5,2300,80,2,"Compressed Natural Gas");
        System.out.println("CNG Engine Details");
        cngEngine.display();
        System.out.println();
        ElectricEngines electricEngine = new ElectricEngines("Z145H5",35.5,2200,48);
        electricEngine.display();
    }
}
