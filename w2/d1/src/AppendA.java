public class AppendA {
    public static void main(String[] args) {

        String[] animals = {"koal", "pand", "zebr"};
        String addLetter = "a";

        for (int i = 0; i < animals.length; i++) {
            animals[i] += addLetter;

            System.out.println(animals[i]);
        }
    }
}

// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end