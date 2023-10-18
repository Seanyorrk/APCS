package Vehicle;

public class VehicleClient {
        
    public static void main(String[] args) {
        
        //create a car and a truck and minivan
        
        Car car1 = new Car("Ford", "Fiesta", 2018, 2000, 4, 100);
        Truck truck1 = new Truck("Ford", "F-150", 2018, 4000, 4, 1000);
        Minivan minivan1 = new Minivan("Ford", "Windstar", 2018, 3000, 4, 100, 7, true);
        
        //toString method
        
        System.out.println(car1.toString());
        System.out.println(truck1.toString());
        System.out.println(minivan1.toString());
        
        //equals method
        
        System.out.println(car1.equals(truck1));
        System.out.println(car1.equals(car1));
        System.out.println(truck1.equals(truck1));
        


    }

}
