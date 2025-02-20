import java.util.ArrayList;


public class Car {

    // Attributes 
    private ArrayList <Passenger>  passengersOnboard;
    private int maxCapacity;

    public Car(int max){
        this.maxCapacity = max;
        this.passengersOnboard = new ArrayList<>();
    }

}