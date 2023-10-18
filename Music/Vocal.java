package Music;

/**
* Vocal class.
*/
public class Vocal extends Instrument {
/**
* constructor
* pre: none
* post: A singer has been created.
*/
public Vocal(String singerName) {
super(singerName);
}
/**
* Returns the sound of the instrument.
* pre: none
* post: The sound made by the singer.
*/
public String makeSound() {
return("LaLaLa");
}
/**
* Returns a String that represents the instrument.
* pre: none
* post: A string representing the singer.
*/
public String toString() {
return(super.getMusician() + " sings " + makeSound() + ".");
}
}
