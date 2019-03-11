//Concrete class named InteriorFeature that implements the interface Feature with the following
package CarFactory;

public class InteriorFeature implements Feature {
//String named interiorFeature as an instance variable.

    String interiorFeature;

//Public default constructor without parameters that sets the interiorFeature instance variable to “Generic”.
    public InteriorFeature() {
        interiorFeature = "Generic";
    }

//o An overloaded constructor with a String parameter of interiorFeature
    public InteriorFeature(String inFeature) {
        //o Set the interiorFeature instance variable to the parameter interiorFeature.
        this.interiorFeature = inFeature;
    }

//Public method named getFeature that doesnt have a formal parameter and that returns an instance of String.
    @Override
    public String getFeature() {
        return interiorFeature;
    }

//Public method setFeature that takes a String parameter interiorFeature and that returns a void. It should set the instance variable interiorFeature.
    @Override
    public void setFeature(String inFeature) {
        this.interiorFeature = inFeature;
    }

//Public toString method that returns the following: Interior [Generic]
    @Override
    public String toString() {
        return "Interior: " + getFeature() + " \n";
    }

}
