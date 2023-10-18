package Music;

public class Trumpet extends Brass {
    
    public Trumpet(String trumpeter) {
        super(trumpeter);
    }

    public String makeSound() {
        return ("AGKJDRNGJRFGOSJEJFN");
    }

    public String toString() {
        return (super.getMusician() + " plays " + makeSound() + ".");
    }
}
