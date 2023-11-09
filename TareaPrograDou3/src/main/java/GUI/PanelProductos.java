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

        g.setColor(Color.cyan);
        g.fillRect(150, 30, 100, 200);

        g.setColor(Color.ORANGE);
        g.fillRect(270, 30, 100, 200);

        g.setColor(Color.PINK);
        g.fillRect(210, 250, 100, 200);

        g.setColor(Color.WHITE);
        g.fillRect(90, 250, 100, 200);
    }
}
