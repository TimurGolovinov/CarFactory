package CarFactory;
//Concrete class named Vehicle that implements the Engine and Chassis interfaces with the following

import java.util.Date;

public class Vehicle implements Engine, Chassis {

    //Private instance variables: 
    private Date vehicleManufacturedDate;
    private String vehicleManufacturer;
    private String vehicleMake;
    private String vehicleModel;
    private Chassis vehicleFrame;
    private String vehicleType;
    private String driveTrain;
    private Engine vehicleEngine;

//Public default constructor with no formal parameters and initialize all instance variables with generic literal values.
    public Vehicle() {
        vehicleManufacturedDate = new Date(119, 01, 01);
        vehicleManufacturer = "BMW";
        vehicleMake = "Rolls-Royce";
        vehicleModel = "Phantom";
        vehicleFrame = new VehicleChassis();
        vehicleType = "Luxury-Sedan";
        driveTrain = "AWD";
        vehicleEngine = new ManufacturedEngine("Honda", new Date(119, 02, 03), "H-Series", "H23A1", 4, "88 AKI", "2WD");

    }

//Public overloaded constructor with values for all of the variables defined above.
    public Vehicle(Date date, String mfg, String make, String model, String type, String driveTrain, Chassis frame, Engine engine) {

        this.vehicleManufacturedDate = date;
        this.vehicleManufacturer = mfg;
        this.vehicleMake = make;
        this.vehicleModel = model;
        this.vehicleFrame = frame;
        this.vehicleType = type;
        this.driveTrain = driveTrain;
        this.vehicleEngine = engine;
    }

//Public method implementations for all of the public methods found in the Engine interface.
    @Override
    public void setEngineCylinders(int engineCylinders) {
        getVehicleEngine().setEngineCylinders(engineCylinders);
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        getVehicleEngine().setEngineManufacturedDate(date);
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        getVehicleEngine().setEngineManufacturer(manufacturer);
    }

    @Override
    public void setEngineMake(String engineMake) {
        getVehicleEngine().setEngineMake(engineMake);
    }

    @Override
    public void setEngineModel(String engineModel) {
        getVehicleEngine().setEngineModel(engineModel);
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        getVehicleEngine().setDriveTrain(driveTrain);
    }

    @Override
    public void setEngineType(String fuel) {
        getVehicleEngine().setEngineType(fuel);
    }

//Public method implementations for the Chassis interface
    @Override
    public void setChassisType(String chasiss) {
        getVehicleFrame().setChassisType(chasiss);
    }

    @Override
    public String getChassisType() {
        return getVehicleFrame().getChassisType();
    }

//Public method implementations that gets sets all instance variables  
    public Date getVehicleManufacturedDate() {
        return vehicleManufacturedDate;
    }

    public void setVehicleManufacturedDate(Date vehicleManufacturedDate) {
        this.vehicleManufacturedDate = vehicleManufacturedDate;
    }

    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }

    public void setVehicleManufacturer(String vehicleManufacturer) {
        this.vehicleManufacturer = vehicleManufacturer;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Chassis getVehicleFrame() {
        return vehicleFrame;
    }

    public void setVehicleFrame(Chassis vehicleFrame) {
        this.vehicleFrame = vehicleFrame;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDriveTrain() {
        return driveTrain;
    }

    public Engine getVehicleEngine() {
        return vehicleEngine;
    }

    public void setVehicleEngine(Engine vehicleEngine) {
        this.vehicleEngine = vehicleEngine;
    }

    //Public toString method that returns the following: 
    @Override
    public String toString() {
        return "Manufacturer Name: " + vehicleManufacturer + " \n"
                + "Manufactured Date: " + vehicleManufacturedDate + " \n"
                + "Vehicle Make: " + vehicleMake + " \n"
                + "Vehicle Model: " + vehicleModel + " \n"
                + "Vehicle Type: " + vehicleType + " \n"
                + "Vehicle Engine: " + vehicleEngine + " \n"
                + vehicleFrame + " \n";
    }
}
