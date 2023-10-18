package Vehicle;

public class Car extends Vehicle {
    
    //create a car class that inherits from vehicle and has a specific number of doors and a trunk capacity

    private int doors;
    private int trunkCapacity;

    public Car(String make, String model, int year, int weight, int doors, int trunkCapacity) {
        super(make, model, year, weight);
        this.doors = doors;
        this.trunkCapacity = trunkCapacity;
    }

    public int getDoors() {
        return doors;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }



    
    
}
