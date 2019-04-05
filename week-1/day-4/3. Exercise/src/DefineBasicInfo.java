public class DefineBasicInfo {
    public static void main(String[] args) {

        // Define several things as a variable then print their values
        // Your name as a string
        // Your age as an integer
        // Your height in meters as a double
        // Whether you are married or not as a boolean

        String myname = "Martin";
        int myage = 27;
        double myheight = 1.93;
        boolean married = false;

        System.out.println("My name is " + myname);
        System.out.println("I am " + myage + " years old");
        System.out.println("My height is " + myheight);
        if (married == true)
            System.out.println("And I am married");
        else
            System.out.println("And I am happy");
    }
}
