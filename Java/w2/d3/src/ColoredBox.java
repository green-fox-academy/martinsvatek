import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {

        Graphics2D graphics2 = (Graphics2D) graphics;

        graphics2.setStroke(new BasicStroke(10));

        graphics.setColor(new Color(60, 255, 60));
        graphics.drawLine(20, 20, 300, 20);

        graphics.setColor(new Color(255, 60, 60));
        graphics.drawLine(300, 20, 300, 300);

        graphics.setColor(new Color(60, 60, 255));
        graphics.drawLine(300, 300, 20, 300);

        graphics.setColor(new Color(255, 60, 255));
        graphics.drawLine(20, 300, 20, 20);

        // Draw a box that has different colored lines on each edge.
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
