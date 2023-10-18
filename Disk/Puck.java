package Disk;

public class Puck extends Disk {
    private double weight;
    private boolean standard;
    private boolean youth;

    public Puck() {
        weight = 5;
        standard = true;
        youth = false;
    }

    public Puck(double weight) {
        super(1.5,1);
        this.weight = weight;
        if (weight >= 5 && weight <= 5.5) {
            standard = true;
            youth = false;
        } else if (weight >= 4 && weight <= 4.5) {
            standard = false;
            youth = true;
        } else {
            standard = false;
            youth = false;
        }
    }

    public double getWeight() {
        return weight;
    }

    public String getDivision() {
        if (standard == true) {
            return "Standard";
        } else if (youth == true) {
            return "Youth";
        } else {
            return "Not a standard or youth puck";
        }
    }

    public boolean equals(Object c) {
        Puck testobj = (Puck) c;
        if (testobj.getRadius() == super.getRadius() && testobj.getThickness() == super.getThickness() && testobj.weight == this.weight) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "The radius is " + super.getRadius() + " and the thickness is " + super.getThickness() + " and the weight is " + weight;
    }

    public static void main(String[] args) {
        Puck puck1 = new Puck(5.5);
        Puck puck2 = new Puck(5.5);
        System.out.println(puck1.equals(puck2));
        System.out.println(puck1.toString());
    }



}
