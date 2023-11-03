import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class FlorPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Dibujar pétalos de la flor
        drawPetal(g2d, 100, 100);
        drawPetal(g2d, 100, 200);
        drawPetal(g2d, 200, 100);
        drawPetal(g2d, 200, 200);

        // Dibujar el centro de la flor
        drawCenter(g2d, 150, 150);
    }

    private void drawPetal(Graphics2D g2d, int x, int y) {
        Ellipse2D ellipse = new Ellipse2D.Double(x, y, 30, 60);
        g2d.setColor(Color.PINK);
        g2d.fill(ellipse);
    }

    private void drawCenter(Graphics2D g2d, int x, int y) {
        Ellipse2D ellipse = new Ellipse2D.Double(x, y, 30, 30);
        g2d.setColor(Color.YELLOW);
        g2d.fill(ellipse);
    }
}

public class DibujoFlor {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Dibujo de Flor");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            frame.setContentPane(new FlorPanel());
            frame.setVisible(true);
        });
    }
}
