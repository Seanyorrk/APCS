package Rectangle;
public class ClientRec {
    
    private double length;
    private double width;

    public ClientRec() {
        length = 1;
        width = 1;
    }

    public ClientRec(double length , double width) {
        this.width = width;
        length = 1;
        this.length = length;
        width = 1;
    }

    public void setLength(double Length) {
        this.length = Length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double area(double length, double width) {
        return length * width;
    }

    public static void area() {
        System.out.println("Circumference = 2 * (length + width)");
    }

    public boolean equals(Object c) {
        ClientRec testobj = (ClientRec) c;
        if (this.length == testobj.length && this.width == testobj.width) {
            return true;
        } else {
            return false;
        }
    }

    //override the toString() method
    public String toString() {
        return "Length: " + length + "\nWidth: " + width;
    }
    
    



}
