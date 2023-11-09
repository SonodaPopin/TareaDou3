package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelMonedas extends JPanel {
    PanelMonedas() {
        super();
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(500, 100));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.MAGENTA);
        g.fillOval(50, 30, 50, 50);
        g.setColor(Color.BLACK);
        g.drawString("100", 70, 65);

        g.setColor(Color.GREEN);
        g.fillOval(150, 30, 50, 50);
        g.setColor(Color.BLACK);
        g.drawString("500", 170, 65);

        g.setColor(Color.YELLOW);
        g.fillOval(250, 30, 50, 50);
        g.setColor(Color.BLACK);
        g.drawString("1000", 270, 65);

        g.setColor(Color.ORANGE);
        g.fillOval(350, 30, 50, 50);
        g.setColor(Color.BLACK);
        g.drawString("1500", 370, 65);
    }
}

