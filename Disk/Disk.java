package Disk;

public class Disk extends Circle {
    
   private double thickness;
   
    public double getThickness() {
    return thickness;
}

public void setThickness(double thickness) {
    this.thickness = thickness;
}

    public Disk() {
        thickness = 1;
    }

    public Disk(double r, double thickness) {
        super(r);
        this.thickness = thickness;
    }

     public double volume() {
        double v;
        v = super.area() * thickness;
        return v;
     }

     public boolean equals(Object c){
            Disk testobj = (Disk) c;
            if (testobj.getRadius() == super.getRadius() && testobj.thickness == this.thickness){
                return true;
            } else {
                return false;
            }
     }

        public String toString(){
            return "The radius is " + super.getRadius() + " and the thickness is " + thickness;
        }
}
