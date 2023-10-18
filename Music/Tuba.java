package Music;

public class Tuba extends Brass {

    public Tuba(String tubaist) {
        super(tubaist);
    }

    public String makeSound() {
        return ("bwomp");
    }

    public String toString() {
        return (super.getMusician() + " plays " + makeSound() + ".");
    }

    
    
}
