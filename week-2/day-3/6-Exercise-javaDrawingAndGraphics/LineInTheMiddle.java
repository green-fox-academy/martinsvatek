import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineInTheMiddle {

    public static void mainDraw(Graphics graphics) {

        Graphics2D graphics2 = (Graphics2D) graphics;

        graphics2.setStroke(new BasicStroke(10));

        graphics.setColor(new Color(255, 0, 0));
        graphics.drawLine(10, 155, 300, 155);

        Graphics2D graphics3 = (Graphics2D) graphics;
        graphics3.setStroke(new BasicStroke(4));

        graphics.setColor(new Color(0, 255, 0));
        graphics.drawLine(158, 10, 158, 300);

        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.
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