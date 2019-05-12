package gardenApplication;

public class Plant {

    public String color;
    double currentWater;
    double waterNeed;
    boolean needsWater;

    public Plant(String color) {
        this.color = color;
        currentWater = 0;
    }

    public boolean setNeedsWater() {
        if (currentWater < waterNeed) {
            needsWater = true;
        } else {
            needsWater = false;
        }
        return needsWater;
    }

    public void watering(double amountOfWater) {
        currentWater += amountOfWater;
    }
}