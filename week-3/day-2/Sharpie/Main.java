package Sharpie;

public class Main {

    public static void main(String[] args) {

        Sharpie firstSharpie = new Sharpie("red", 10f);
        Sharpie secondSharpie = new Sharpie("blue", 50f);
        Sharpie thirdSharpie = new Sharpie("yellow", 25f);

        firstSharpie.print();
        secondSharpie.print();
        thirdSharpie.print();
        System.out.println("---After use---");
        firstSharpie.use();
        secondSharpie.use();
        thirdSharpie.use();
        firstSharpie.print();
        secondSharpie.print();
        thirdSharpie.print();
    }
}