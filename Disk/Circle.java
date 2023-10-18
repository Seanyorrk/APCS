package Disk;

public class Circle {

    private double radius;
    private String color;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setradius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public static void CircumferenceFormula(){
        System.out.println("Circumference = 2 * pi * radius");
    }

    public boolean equals(Object c) {
        Circle testobj = (Circle) c;
        if (this.radius == testobj.radius) {
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        return "The radius is " + radius;
        
    }
    
    

}


