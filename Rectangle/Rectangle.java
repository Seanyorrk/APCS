package Rectangle;
public class Rectangle {
    
    public static void main(String[] args) {
        ClientRec spot1 = new ClientRec(7, 8);
        ClientRec spot2 = new ClientRec(8, 9);
        ClientRec spot3 = new ClientRec(5, 7);

        System.out.println("The length of spot1 is " + spot1.getLength());
        System.out.println("The length of spot2 is " + spot2.getLength());

        //spot1.setLength(10);

        System.out.println("The length of spot1 is " + spot1.getLength());

        System.out.println("The area of spot3 is " + spot3.getLength() + " and the width is " + spot3.getWidth());

        System.out.println("The area of spot2 is " + spot3.area(spot3.getLength(), spot3.getWidth()));

        ClientRec.area();

        //print compareTo and compare 

         System.out.println(spot1.compare(spot2));

        System.out.println(spot1.compareTo(spot2));


        System.out.println(spot1.equals(spot2));

        System.out.println(spot2.equals(spot3));


    }
}
