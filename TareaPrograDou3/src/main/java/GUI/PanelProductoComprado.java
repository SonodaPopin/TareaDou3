package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelProductoComprado extends JPanel {
    PanelProductoComprado(){
        super();

        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(500, 100));
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(115, 15, 400, 75);
    }
}

