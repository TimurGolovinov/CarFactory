package CarFactory;



public interface Chassis {

    //A public constant string named chassis with a value of “Chassis”.
    public final String chassis = "Chassis";

    //The definition of a public getChassisType method that returns an instance of Chassis.  
    public String getChassisType();
    
    //The definition of a public setChassisType that accepts a string named vehicleChassis and returns a void.
    public void setChassisType(String chasiss);

}
