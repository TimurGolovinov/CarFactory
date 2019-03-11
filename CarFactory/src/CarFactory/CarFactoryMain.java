//Golovinov Timur
//Car manufacturing programm illustrates car assembly from different parts implemented through
//interfaces and concrete classes
//24/02/2019
package CarFactory;

import java.util.Date;

public class CarFactoryMain {

    public static void main(String[] args) {
        //Static main method that creates two objects, one with the default constructor and the other with the constructor with parameters.
        VehicleChassis vc1 = new VehicleChassis();
        VehicleChassis vc2 = new VehicleChassis("Long Chassis Base");
        System.out.println(vc2);
        
        //Static main method that tests two scenarios:
        VehicleFrame vf1 = new VehicleFrame();
        VehicleFrame vf2 = new VehicleFrame("Ladder Frame");

        //Print all fuel grade values, like:Chassis : Chassis Vehicle Frame : Unibody 
        System.out.println(vf1 + "\n");
        //One that prints a value set by a single string value. Vehicle Frame : Ladder Frame
        System.out.println("Vehecle Frame: " + vf2.getVehicleFrameType() + "\n");

        //Static main method that tests two scenarios:
        ManufacturedEngine me1 = new ManufacturedEngine();
        ManufacturedEngine me2 = new ManufacturedEngine("Honda", new Date(119, 02, 03), "H-Series", "H23A1", 4, "88 AKI", "2WD");
        //One that prints a generic set of strings, like:
        System.out.println(me1);
        System.out.println(me2);

        //Static main method that tests two scenarios of interior features:
        InteriorFeature inF1 = new InteriorFeature();
        InteriorFeature inF2 = new InteriorFeature("Climate Control");

        //Print all values, like: 
        System.out.println(inF1);
        System.out.println(inF2);

        //Static main method that tests two scenarios of exterior features:
        ExteriorFeature exF1 = new ExteriorFeature();
        ExteriorFeature exF2 = new ExteriorFeature("Fog Lamps");
        //Print all values, like: 
        System.out.println(exF1);
        System.out.println(exF2);

        //Static main method that tests two scenarios including a vehicle:
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle(new Date(119, 02, 03), "ABC", "Honda", "Prelude", "Sedan", "AWD", vf2, me2);
        //Print all values, like: 
        System.out.println(vehicle1);
        System.out.println(vehicle2);

        //Static main method that tests two scenarios of manufactured cars:
        Car car1 = new Car();
        Feature[] feature = new Feature[4];
        feature[0] = new ExteriorFeature("Wood Panel");
        feature[1] = new InteriorFeature("Air Conditioning");
        feature[2] = new ExteriorFeature("Moonroof");
        feature[3] = new InteriorFeature("AM/FM Radio");
        Car car2 = new Car(feature, 2);

        //Print all values, like: 
        System.out.println(car1);
        System.out.println(car2);
    }

}
