package Music;


/**
* Woodwind class.
*/
abstract class Woodwind extends Instrument {
/**
* constructor
* pre: none
* post: A woodwind instrument has been created.
*/
public Woodwind(String player) {
super(player);
}
/**
* Returns the sound of the instrument.
* pre: none
* post: The sound made by the instrument is returned.
*/
public String makeSound() {
return("toot");
}
}