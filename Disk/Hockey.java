package Disk;

public class Hockey extends Disk {
  //create a hockey class to test the puck class

    public static void main(String[] args) {
        //create a puck object
        Puck puck1 = new Puck(5.5);
        Puck puck2 = new Puck(5.5);
        //print out the results of the equals method
        System.out.println(puck1.equals(puck2));
        //print out the results of the toString method
        System.out.println(puck1.toString());
    }

    

     
}
