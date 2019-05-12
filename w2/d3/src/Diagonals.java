import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void mainDraw(Graphics graphics) {

        for (int i = 0 - 320; i < HEIGHT; i += 40) {

            Graphics2D graphics1 = (Graphics2D) graphics;
            graphics1.setStroke(new BasicStroke(10));

            graphics.setColor(Color.green);
            graphics.drawLine(i, 0, WIDTH + i, HEIGHT);
        }

        for (int i = 0 - 320; i < HEIGHT; i += 40) {

            Graphics2D graphics2 = (Graphics2D) graphics;
            graphics2.setStroke(new BasicStroke(10));

            graphics.setColor(Color.red);
            graphics.drawLine(HEIGHT, i, 0, WIDTH + i);
        }

        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.
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