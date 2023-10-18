package Vehicle;

abstract class Vehicle {

    

    private String make;
    private String model;
    private int year;
    private int weight;

    public Vehicle(String make, String model, int year, int weight) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.weight = weight;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getWeight() {
        return weight;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // make Vehicle an abstract class

    public abstract void setModel(String model);

}
