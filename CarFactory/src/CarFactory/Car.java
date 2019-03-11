//Concrete class named Car that extends the Vehicle class with the following:
package CarFactory;

public class Car extends Vehicle {
//Private instance variables:

    private Feature[] feature = new Feature[10];
    private int carAxle;

//Default constructor with no formal parameters and initialize all instance variables with generic literal values by using the super() call.
    public Car() {
        super();
        feature[0] = new ExteriorFeature("Wood Panel");
        feature[1] = new InteriorFeature("Air Conditioning");
        feature[2] = new ExteriorFeature("Moonroof");
        feature[3] = new InteriorFeature("AM/FM Radio");
    }

//Public overloaded constructor with a super() method call and instantiation of values for all of the variables defined above.
    public Car(Feature[] f, int ax) {
        super();
        this.feature = f;
        this.carAxle = ax;
    }

//Public toString method that returns the following: 
    @Override
    public String toString() {
        return "Manufacturer Name: " + getVehicleManufacturer() + " \n"
                + "Manufactured Date: " + getVehicleManufacturedDate() + " \n"
                + "Vehicle Make: " + getVehicleMake() + " \n"
                + "Vehicle Model: " + getVehicleModel() + " \n"
                + "Vehicle Type: " + getVehicleType() + " \n"
                + "Vehicle Engine: " + getVehicleEngine()
                //Public methods to return formatted strings of the Internal and External features: 
                + "Features: " + " \n"
                + feature[0].toString()
                + feature[1].toString()
                + feature[2].toString()
                + feature[3].toString()
                + "Car Axle: " + carAxle + " \n";
    }
}
