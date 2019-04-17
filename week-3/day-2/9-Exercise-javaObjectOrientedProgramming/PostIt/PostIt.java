package PostIt;

public class PostIt {

    String backgroundColor;
    String text;
    String textColor;

    public PostIt(String backgroundColor, String text, String textColor) { //constructor

        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public void print() {
        System.out.println("background color is: " + this.backgroundColor);
        System.out.println("text is: " + this.text);
        System.out.println("text color is: " + this.textColor);
    }
}

//Create a PostIt class that has
    // a backgroundColor
    // a text on it
    // a textColor
// Create a few example post-it objects:
    // an orange with blue text: "Idea 1"
    // a pink with black text: "Awesome"
    // a yellow with green text: "Superb!"