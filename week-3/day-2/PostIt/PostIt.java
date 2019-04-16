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