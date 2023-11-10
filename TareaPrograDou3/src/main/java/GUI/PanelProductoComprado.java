package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa un panel de producto comprado
 */
public class PanelProductoComprado extends JPanel {
    /**
     * Método constructor que crea el panel
     */
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

