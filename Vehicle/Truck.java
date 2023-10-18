package Vehicle;

public class Truck extends Vehicle {
    
    //create a truck class that inherits from vehicle and has a specific number of wheels and a load capacity
    private int wheels;
    private int loadCapacity;

    public Truck(String make, String model, int year, int weight, int wheels, int loadCapacity) {
        super(make, model, year, weight);
        this.wheels = wheels;
        this.loadCapacity = loadCapacity;
    }


    public int getLoadCapacity() {
        return loadCapacity;
    }

   

     public int getWheels() {
        return wheels;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

     public void setWheels(int wheels) {
        this.wheels = wheels;
    }



}
