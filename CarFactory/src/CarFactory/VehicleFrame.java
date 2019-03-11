package CarFactory;
//Concrete class named VehicleFrame that implements the interface Chassis with the following: 

public class VehicleFrame implements Chassis {

//String named vehicleFrameType instance variable.
    String vehicleFrameType;

//A public default constructor
    public VehicleFrame() {
        this.vehicleFrameType = "Unibody";
    }
//An overloaded constructor with a String parameter of vehicleFrameType
    //Set the vehicleFrameType instance variable in both, use “Unibody” as the default String value.

    public VehicleFrame(String vft) {
        this.vehicleFrameType = "Unibody";
        this.vehicleFrameType = vft;
    }

//A public method named getChassisType that didn't have a formal parameter and that returns an instance of the interface Chassis (hint that would be a copy of this class).
    @Override
    public String getChassisType() {
        return chassis;
    }

//Vehicle frame type getter
    public String getVehicleFrameType() {
        return vehicleFrameType;
    }

//A public method setChassisType that takes a String parameter vehicleFrameType and that returns a void. It should set the instance variable vehicleFrameType.
    @Override
    public void setChassisType(String vft) {
        this.vehicleFrameType = vft;
    }

//A public toString method that returns the following: Chassis : Chassis Vehicle Frame : Unibody
    @Override
    public String toString() {
        return "Chassis Name:" + getChassisType() + " \n"
                + "Vehicle Frame: " + vehicleFrameType;
    }

}
