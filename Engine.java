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

    public FuelType getFuelType() {
        return this.f;
    }

    public double getMaxFuel() {
        return this.maxFuelLevel;
    }

    public double getCurrentFuel() {
        return this.currentFuelLevel;
    }

    public void refuel() {
        this.currentFuelLevel = maxFuelLevel;
    }

    public Boolean go(double fuel) {
        this.currentFuelLevel -= fuel;
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