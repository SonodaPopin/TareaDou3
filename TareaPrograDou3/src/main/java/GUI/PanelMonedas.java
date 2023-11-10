package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa un panel con monedas
 */
public class PanelMonedas extends JPanel {
    /**
     * Método constructor que crea el panel
     */
    PanelMonedas() {
        super();
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(500, 100));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.CYAN);
        g.fillOval(50, 20,70 , 70);
        g.setColor(Color.BLACK);
        g.drawString("100", 70, 60);

        g.setColor(Color.GREEN);
        g.fillOval(150, 20, 70, 70);
        g.setColor(Color.BLACK);
        g.drawString("500", 170, 60);

        g.setColor(Color.YELLOW);
        g.fillOval(250, 20, 70, 70);
        g.setColor(Color.BLACK);
        g.drawString("1000", 270, 60);

        g.setColor(Color.ORANGE);
        g.fillOval(350, 20, 70, 70);
        g.setColor(Color.BLACK);
        g.drawString("1500", 370, 60);
    }
}

