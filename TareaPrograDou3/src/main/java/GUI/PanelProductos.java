package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelProductos extends JPanel {
    PanelProductos() {
        super();
        this.setBackground(Color.GRAY);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.green);
        g.fillRect(30, 30, 100, 200);
        g.setColor(Color.BLACK);
        g.drawString("Sprite", 55, 60);

        g.setColor(Color.cyan);
        g.fillRect(150, 30, 100, 200);
        g.setColor(Color.BLACK);
        g.drawString("CocaCola", 175, 60);

        g.setColor(Color.ORANGE);
        g.fillRect(270, 30, 100, 200);
        g.setColor(Color.BLACK);
        g.drawString("Fanta", 295, 60);

        g.setColor(Color.PINK);
        g.fillRect(210, 250, 100, 200);
        g.setColor(Color.BLACK);
        g.drawString("Super8", 235, 280);

        g.setColor(Color.WHITE);
        g.fillRect(90, 250, 100, 200);
        g.setColor(Color.BLACK);
        g.drawString("Snicker", 115, 280);
    }
}
