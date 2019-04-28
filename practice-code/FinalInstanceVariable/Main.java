package FinalInstanceVariable;

public class Main {
    public static void main(String[] args) {

        Data dataObject = new Data (10); // value for constructor (for our final variable)

        for (int i = 0; i < 10; i++) {
            dataObject.add();

            System.out.printf("%s", dataObject);
        }
    }
}