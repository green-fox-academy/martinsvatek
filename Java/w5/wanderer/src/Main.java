import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;


public class Main extends JComponent implements KeyListener {

    final static int TILE_SIZE = 72;

    Game game;

    public Main() {
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
        game = new Game();
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        List<Tile> tiles = game.getTiles();
        tiles.sort((tile1, tile2) -> tile1.getLayer() - tile2.getLayer());
        tiles.forEach(tile -> paintTile(tile, graphics));
    }

    public static void paintTile(Tile tile, Graphics graphics) {
        int x = tile.getX() * TILE_SIZE;
        int y = tile.getY() * TILE_SIZE;
        PositionedImage image = new PositionedImage(tile.getImageName(), x, y);
        image.draw(graphics);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RPG Game");
        Main board = new Main();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(board);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}