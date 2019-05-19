import java.util.ArrayList;
import java.util.List;

public class Game {

    int[] initialMapLayout = {
            2, 0, 0, 0, 0,
            0, 1, 0, 0, 1,
            0, 1, 0, 0, 0,
            0, 1, 1, 1, 1,
            0, 0, 0, 0, 0,
    };

    private List<Tile> tiles;

    public Game() {
        tiles = new ArrayList<>();
    }

    private void generateTilesFromLayout() {
        for (int i = 0; i < initialMapLayout.length; ++i) {
            int number = initialMapLayout[i];
            int x = i % 5;
            int y = i / 5;
            if (number == 1) {
                tiles.add(new Wall(x, y));
            } else {
                tiles.add(new Floor(x, y));
            }
        }
    }

    public List<Tile> getTiles() {
        generateTilesFromLayout();
        Tile t2 = new Hero();
        tiles.add(t2);
        return tiles;
    }
}