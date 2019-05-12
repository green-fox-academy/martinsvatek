package gardenApplication;

public class Tree extends Plant {

    public Tree(String color){
        super(color);
        waterNeed = 10;
    }

    public void watering(int amountOfWater) {
        currentWater += amountOfWater * 0.4;
    }
}