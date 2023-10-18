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
    

   //add a comparable interface to compare the height and width of the rectangle, if any of them are the same, return return 0, if spot1 is smaller than spot2, return 1, if spot1 is bigger than spot2, return -1

    public int compare(ClientRec c) {
        if (this.length == c.length || this.width == c.width) {
            return 0;
        } else if (this.length < c.length || this.width < c.width) {
            return 1;
        } else {
            return -1;
        }

        
    }
    

    //add a compareTo method to compare the area of the rectangle

    public interface ComparableArea {
        int compareToArea(Object obj);
 }

    public int compareTo(ClientRec c) {
        if (this.length * this.width == c.length * c.width) {
            return 0;
        } else if (this.length * this.width < c.length * c.width) {
            return 1;
        } else {
            return -1;
        }
    }
    



}

// Path: Rectangle/Rectangle.java
