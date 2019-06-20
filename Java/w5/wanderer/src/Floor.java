public class Floor extends MapTile implements Tile {
    public Floor(int x, int y) {
        super(x, y);
    }

    public String getImageName() {
        return "img/floor.png";
    }
}