public class Passenger implements PassengerRequirements {
    
    private String name;
  /** 
   * Constructor for passenger name
   * @param name
   */
    public Passenger(String name) {
        this.name = name;
    }
    /**
     * "getter" which gets the name of the passenger
     * @return name of passenger
    */
    public String getName() {
        return name;
    }
    /**
     * "setter" for the name of the passenger
     * @param name (new name of passenger)
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Passenger boards a train car
     * @param c specific car that passenger boards
     */
    @Override
    public void boardCar(Car c) {
       if (c.addPassenger(this)){
        System.out.println(name + "boarded the car");
       }  else {
        System.out.println(name + "could not board car");
       }
    }
    /**
     * Passenger gets off car
     * @param c (car passenger is leaving)
     */
    @Override
    public void getOffCar(Car c) {
       if (c.removePassenger(this)) {
        System.out.println(name + "got off car");
       } else {
        System.out.println(name + "did not remove, passenger may not be in car");
       }
    }
}
