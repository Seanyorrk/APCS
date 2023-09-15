package Rectangle;
public class Rectangle {
    
    public static void main(String[] args) {
        ClientRec spot1 = new ClientRec(1, 66666666);
        ClientRec spot2 = new ClientRec(5, 6);
        ClientRec spot3 = new ClientRec(5, 6);

        System.out.println("The length of spot1 is " + spot1.getLength());
        System.out.println("The length of spot2 is " + spot2.getLength());

        spot1.setLength(8);

        System.out.println("The length of spot1 is " + spot1.getLength());

        System.out.println("The area of spot3 is " + spot3.getLength() + " and the width is " + spot3.getWidth());

        System.out.println("The area of spot2 is " + spot3.area(spot3.getLength(), spot3.getWidth()));

        ClientRec.area();

        System.out.println(spot2.equals(spot3));


    }
}
