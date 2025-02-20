public class Engine implements EngineRequirements {

    // Attributes 
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;


    /**
     * 
     * @param f
     * @param currentFuelLevel
     * @param maxFuelLevel
     */


    public Engine(FuelType f, double currentFuelLevel, double maxFuelLevel) {
        this.f = f;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;

    }

    /**
     * getter for fuel type
     * @return the fuel type
     */

    public FuelType getFuelType() {
        return this.f;
    }


    /**
     * getter for maxFuel level 
     * @return the maxFuel level
     */

    public double getMaxFuel() {
        return this.maxFuelLevel;
    }


    /**
     * getter for currentFuel level
     * @return the currentFuel level 
     */

    public double getCurrentFuel() {
        return this.currentFuelLevel;
    }

    /**
     * resets Engine's current fuel level to maximum
     */


    public void refuel() {
        this.currentFuelLevel = maxFuelLevel;
    }

    /**
     * 
     * @param amt
     * @return true or false depending on if fuel level is above 0
     */


    public Boolean go(double amt) {
        this.currentFuelLevel -= amt;
        System.out.println(currentFuelLevel);
        if (this.currentFuelLevel == 0) {
            return true;
        } else {
            return false;
        }
    }


    // toString() tells Java "when I try to print this object, here's how I want you to format it."
    public String toString() {
        return("\n Engine has fuel type: " + this.f + "\n Current fuel level is: " + this.currentFuelLevel + "\n Max fuel level: " + this.maxFuelLevel);
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 100.0);
        System.out.println(myEngine);
    }


}