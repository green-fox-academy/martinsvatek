package Dominoes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Domino> dominoes = initializeDominoes();

        // You have the list of Main
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        List<Domino> snakeDominoes = new ArrayList<>();

        for (int i = 0; i < dominoes.size(); i++) {
            for (int j = 0; j < dominoes.size(); j++) {
                if (dominoes.get(i).getRightSide() == dominoes.get(j).getLeftSide()) {
                    if (!snakeDominoes.contains(dominoes.get(i)) && !snakeDominoes.contains(dominoes.get(j))) {
                        snakeDominoes.add(dominoes.get(i));
                        snakeDominoes.add(dominoes.get(j));
                    }
                }
            }
        }
        System.out.println(dominoes);
        System.out.println(snakeDominoes);
    }

    public static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}