// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

import java.util.ArrayList;

public class TodoPrint {

    public static void main(String[] args) {

        String todoText = "My todo:\n";
        String firstTodo = " - Buy milk\n";
        String secondTodo = " - Download games\n";
        String underSecondWithIndent = "\t - Diablo";

        String todo = todoText + firstTodo + secondTodo + underSecondWithIndent;

        System.out.println(todo);
    }
}