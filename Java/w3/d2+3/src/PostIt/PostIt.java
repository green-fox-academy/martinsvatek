package PostIt;

public class PostIt {

    private String backgroundColor;
    private String text;
    private String textColor;

    public PostIt(String backgroundColor, String text, String textColor) { //constructor

        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;

    }

    public void print() {

        System.out.println("background color is: " + backgroundColor);
        System.out.println("text is: " + text);
        System.out.println("text color is: " + textColor);
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