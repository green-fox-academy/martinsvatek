package bettingSystem;

public class Contestant {

    private String name; // name of the contestant
    private int placement; // represents the place the contestant finished at the race. It's default value is 0

    public Contestant(String name) { // constructor
        this.name = name;
        placement = 0;
    }

    public void setPlacement(int place) {
        placement = place;
    }


    public String toString() {
        return name + " has finished on place: " + placement;
    }
}