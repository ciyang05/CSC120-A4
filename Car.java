import java.util.ArrayList;


public class Car {

    // Attributes 
    private ArrayList <Passenger>  passengersOnboard;
    private int maxCapacity;



    /**
     * the constructor
     * will initialize the maxCapcity and arraylist for passengers on baord
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


    /**
     * checks to see if car is full and passenger is already on board. if not, adds passenger to array list
     * @param p
     * @return false if maxCapacity is filled and passenger p is on board. otherwise, return true
     */

    public boolean addPassenger(Passenger p) {
        int cap = passengersOnboard.size();
        if (cap == maxCapacity && passengersOnboard.contains(p)) {
            return false;

        } else {
            passengersOnboard.add(p);
                return true;
        }
        

    }

    public Passenger removePassenger(Passenger p) {
        pass;
    }


    /**
     * prints out list of passengers on board. if no passengers present, will print out that car is empty.
     * 
     */

    public void printManifest() {
        System.out.println("Passengers on Board: ");
        if (!passengersOnboard.isEmpty()) {          
            System.out.println(passengersOnboard);
        } else {
            System.out.println("This car is EMPTY.");
        }
    }
}

