package Vehicle;

public class Minivan extends Vehicle {
    //create a minivan class that inherits from car and has a specific number of seats and a sliding door

    private int seats;
    private boolean slidingDoor;

    public Minivan(String make, String model, int year, int weight, int doors, int trunkCapacity, int seats, boolean slidingDoor) {
        
        this.seats = seats;
        this.slidingDoor = slidingDoor;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isSlidingDoor() {
        return slidingDoor;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setSlidingDoor(boolean slidingDoor) {
        this.slidingDoor = slidingDoor;
    }



}
