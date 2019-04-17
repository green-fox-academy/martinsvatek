import java.util.ArrayList;
import java.util.HashMap;

public class DoableHomework {

    public static void main(String[] args) {

        ArrayList<HashMap<String, Object>> listOfMaps = new ArrayList<>();

        HashMap<String, Object> treeOne = new HashMap<>();
        treeOne.put("type", "black cherry");
        treeOne.put("leaf color", "green");
        treeOne.put("age", 20);
        treeOne.put("sex", "male");
        listOfMaps.add(treeOne);

        HashMap<String, Object> treeTwo = new HashMap<>();
        treeTwo.put("type", "elm");
        treeTwo.put("leaf color", "brown");
        treeTwo.put("age", 30);
        treeTwo.put("sex", "female");
        listOfMaps.add(treeTwo);

        HashMap<String, Object> treeThree = new HashMap<>();
        treeThree.put("type", "willow");
        treeThree.put("leaf color", "light green");
        treeThree.put("age", 40);
        treeThree.put("sex", "male");
        listOfMaps.add(treeThree);

        HashMap<String, Object> treeFour = new HashMap<>();
        treeFour.put("type", "black ash");
        treeFour.put("leaf color", "dark green");
        treeFour.put("age", 50);
        treeFour.put("sex", "female");
        listOfMaps.add(treeFour);

        HashMap<String, Object> treeFive = new HashMap<>();
        treeFive.put("type", "maple");
        treeFive.put("leaf color", "black");
        treeFive.put("age", 60);
        treeFive.put("sex", "male");
        listOfMaps.add(treeFive);

        for (HashMap tree: listOfMaps) {
            System.out.println(tree);
        }
    }
}

//Create 5 trees
//Store the data of them in variables in your program
//for every tree the program should store its'
//type
//leaf color
//age
//sex
//you can use just variables, or lists and/or maps