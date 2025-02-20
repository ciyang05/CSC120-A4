import java.util.ArrayList;


public class Car {

    // Attributes 
    private ArrayList <Passenger>  passengersOnboard;
    private int maxCapacity;


    /**
     * 
     * @param maxCapacity
     */

    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<>();
    }

    /**
     * the getter for max capacity
     * @return maxCapacity
     */

    public int getCapacity() {
        return this.maxCapacity;
    }

    /**
     * the getter for seatsRemaining method 
     * @return number of seats remaining 
     */

    public int seatsRemaining() {
        return seatsRemaining();
    }

    public Passenger addPassenger(Passenger p) {
        

    }

}

