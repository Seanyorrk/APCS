package Coin;

public class Coin {
    private int face;

    public Coin() {
        flip();
    }

    public void flip() {
        face = (int) (Math.random() * 2);
    }

    public boolean isHeads() {
        return (face == 0);
    }

    public String toString() {
        String faceName;
        if (face == 0)
            faceName = "Heads";
        else
            faceName = "Tails";
        return faceName;
    }
}