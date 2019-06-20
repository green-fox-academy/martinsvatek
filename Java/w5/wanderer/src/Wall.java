public class Wall extends MapTile implements Tile {
    public Wall(int x, int y) {
        super(x, y);
    }

    public String getImageName() {
        return "wall.png";
    }
}