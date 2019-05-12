import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {

        // Fill the canvas with a checkerboard pattern.

        for (int row = 0; row < WIDTH + 1; row++) {
            for (int column = 0; column < HEIGHT + 1; column++) {

                if (row % 2 == 0) {
                    if (column % 2 == 0) {
                        miniRectangle(graphics, row, column);
                    }
                } else if (column % 2 != 0) {
                    miniRectangle(graphics, row, column);
                }
            }
        }
    }

    private static void miniRectangle(Graphics g, int row, int column) {

        int size = 20;

        g.setColor(Color.pink);
        g.fillRect(row * size, column * size, size, size);
    }

    // Don't touch the code below

    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}