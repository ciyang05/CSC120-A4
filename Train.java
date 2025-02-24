import java.util.ArrayList;

public class Train implements TrainRequirements{

    //Attributes
    private ArrayList <Car>  cars;
    private Engine engine;


   

    /**
     * @param fuelType
     * @param currentFuelLevel
     * @param fuelCapacity
     * @param Car
     * @param passengerCapacity
     */
    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCar, int passengerCapacity){
        
        this.cars = new ArrayList<Car>();
        nCar
        this.engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);



    }


}
