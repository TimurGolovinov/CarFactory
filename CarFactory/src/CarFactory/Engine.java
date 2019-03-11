
package CarFactory;

import java.util.Date;

//Interface of engine for vehicle 

public interface Engine {
    public void setEngineCylinders(int engineCylinders);
    public void setEngineManufacturedDate(Date date);
    public void setEngineManufacturer(String manufacturer);
    public void setEngineMake(String engineMake);
    public void setEngineModel(String engineModel);
    public void setDriveTrain(String driveTrain);
    public void setEngineType(String fuel);
}
