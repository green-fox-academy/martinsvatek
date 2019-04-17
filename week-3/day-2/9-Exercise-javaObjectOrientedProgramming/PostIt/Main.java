package PostIt;

public class Main {

    public static void main(String[] args) {

        PostIt postOne = new PostIt("orange", "Idea 1", "blue");
        PostIt postTwo = new PostIt("pink", "Awesome", "black");
        PostIt postThree = new PostIt("yellow", "Superb!", "green");

        postOne.print();
        System.out.println("---");
        postTwo.print();
        System.out.println("---");
        postThree.print();
    }
}