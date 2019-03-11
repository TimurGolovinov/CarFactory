//Concrete class named ExteriorFeature that implements the interface Feature with the following
package CarFactory;

public class ExteriorFeature implements Feature {
//String named exteriorFeature as an instance variable.

    String exteriorFeature;

//Public default constructor without parameters that sets the exteriorFeature instance variable.
    public ExteriorFeature() {
        exteriorFeature = "Body Kit";
    }

//Overloaded constructor with a String parameter of exteriorFeature
    public ExteriorFeature(String exFeature) {
        this.exteriorFeature = exFeature;
    }

//Public method named getFeature that doesnt have a formal parameter and that returns an instance of String.
    @Override
    public String getFeature() {
        return exteriorFeature;
    }

//Public method setFeature that takes a String parameter interiorFeature and that returns a void. It should set the instance variable interiorFeature.
    @Override
    public void setFeature(String exFeature) {
        this.exteriorFeature = exFeature;
    }
    
//Ppublic toString method that returns the following: Interior [Generic]
    @Override
    public String toString() {
        return "Exterior: " + getFeature() + " \n";
    }

}
