package Sharpie;

public class Sharpie {

    private String color;
    private Float width;
    private Float inkAmount;

    public Sharpie(String color, Float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100f;
    }

    public void use() {
        inkAmount--;
    }

    public void print() {
        System.out.println("Color: " + color + " --- Width: " + width + " --- inkAmount: " + inkAmount);
    }
}

// Create Sharpie class
    // We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
    // When creating one, we need to specify the color and the width
    // Every sharpie is created with a default 100 as inkAmount
    // We can use() the sharpie objects
        // which decreases inkAmount