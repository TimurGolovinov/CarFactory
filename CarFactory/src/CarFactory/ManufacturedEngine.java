//Concrete class named ManufacturedEngine that implements the interface Engine with the following: 
package CarFactory;

import java.util.Date;

public class ManufacturedEngine implements Engine {
//Private instance variables: 
    private String engineManufacturer;
    private Date engineManufacturedDate;
    private String engineMake;
    private String engineModel;
    private int engineCylinders;
    private String engineType;
    private String driveTrain;

//Public default constructor with no formal parameters and initialize all instance variables with generic literal values.
    public ManufacturedEngine() {
        engineManufacturer = "RR";
        engineManufacturedDate = new Date(119, 01, 01);
        engineMake = "BMW";
        engineModel = "JZV8";
        engineCylinders = 8;
        engineType = "Fuel";
        driveTrain = "AWD";
    }
    
//Public overloaded constructor with values for all of the variables defined above.
    public ManufacturedEngine(String emfg, Date date, String emake, String emodel, int c, String etype, String dt) {
        this.engineManufacturer = emfg;
        this.engineManufacturedDate = date;
        this.engineMake = emake;
        this.engineModel = emodel;
        this.engineCylinders = c;
        this.engineType = etype;
        this.driveTrain = dt;
    }
    
//Public method implementations for all of the public methods found in the Engine interface. 
    @Override
    public void setEngineCylinders(int c) {
        this.engineCylinders = c;
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        this.engineManufacturedDate = date;
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        this.engineManufacturer = manufacturer;
    }

    @Override
    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    @Override
    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineType(String fuel) {
        this.engineType = fuel;
    }

    //A public toString method that returns the following: 
    @Override
    public String toString() {
        return "Engine Manufacturer: " + engineManufacturer + " \n"
                + "Engine Manufactured: " + engineManufacturedDate + " \n"
                + "Engine Make: " + engineMake + " \n"
                + "Engine Model: " + engineModel + " \n"
                + "Engine Type: " + engineType + " \n"
                + "Engine Cylinders: " + engineCylinders + " \n"
                + "Drive Train: " + driveTrain + " \n";
    }
}
