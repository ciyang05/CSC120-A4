import java.util.ArrayList;

public class Train implements TrainRequirements{

    //Attributes
    private ArrayList<Car>  cars;
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
        for (int i = 0; i <= nCar; i++){
            Car Car = new  Car(passengerCapacity);
            cars.add(Car);
        }

        this.engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);

    

    }

    public Engine getEngine(){
        return this.engine;

    }

    public Car getCar(int i){
        return this.cars.get(i);

    }
    public int getMaxCapacity(){
        for (int i = 0){

            
        }
        return this.MaxCapacity;
    }




}
