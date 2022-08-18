package main;

import data.CNGEngines;
import data.DieselEngines;
import data.ElectricEngines;
import data.PetrolEngines;

public class EngineImpl {
    public static void main(String[] args) {
        PetrolEngines petrolEngine = new PetrolEngines("K195B5",25.5,2500,4,"Petrol");
        petrolEngine.display();
        System.out.println();
        DieselEngines dieselEngine = new DieselEngines("C145D5",30.2,2000,4,"Diesel");
        dieselEngine.display();
        System.out.println();
        CNGEngines cngEngine = new CNGEngines("Q135F5",27.5,2300,4,"Compressed Natural Gas");
        cngEngine.display();
        System.out.println();
        ElectricEngines electricEngine = new ElectricEngines("Z125H5",35.5,3000,0,"Voltage");
        electricEngine.display();
    }
}
