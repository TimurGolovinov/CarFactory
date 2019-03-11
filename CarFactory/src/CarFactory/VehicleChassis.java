package CarFactory;

public class VehicleChassis implements Chassis {
//String named chassisName instance variable.

    public String chassisName;

//Public default constructor
    public VehicleChassis() {
        this.chassisName = Chassis.chassis;
    }
    
//An overloaded constructor with a String parameter of chassisName
    public VehicleChassis(String cn) {
        //o Set the chassisName instance variable in both, use the interface constant as the default String value.
        this.chassisName = cn;
    }
    
//A public method named getChassisType that doesnt have a formal parameter and that returns an instance of the interface Chassis (hint that would be a copy of this class).
    @Override
    public String getChassisType() {
        return chassis;
    }
    
//A public method setChassisType that takes a String parameter vehicleChassis and that returns a void. It should set the instance variable chassisName.
    @Override
    public void setChassisType(String ct) {
        this.chassisName = ct;
    }
    
//A public toString method that returns the following: Chassis Name : Chassis
    @Override
    public String toString() {
        return "Chassis Name: " + chassisName;
    }

}
