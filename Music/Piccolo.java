package Music;

/**
* Piccolo class.
*/
public class Piccolo extends Woodwind {
/**
* constructor
* pre: none
* post: A piccolo has been created.
*/
public Piccolo(String piccoloist) {
super(piccoloist);
}
/**
* Returns the sound of the instrument.
* pre: none
* post: The sound made by the instrument is returned.
*/
public String makeSound() {
return("peep");
}
/**
* Returns a String that represents the instrument.
* pre: none
* post: A string representing the instrument has
* been returned.
*/
public String toString() {
return(super.getMusician() + " plays " + makeSound() + ".");
}
}