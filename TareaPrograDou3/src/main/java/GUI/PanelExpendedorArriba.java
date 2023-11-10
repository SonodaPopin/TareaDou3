package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa el panel de la parte de arriba del expendedor
 */
public class PanelExpendedorArriba extends JPanel {
    /**
     * Método constructor que crea el panel
     */
    PanelExpendedorArriba(){
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(500, 100));
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(210, 25, 200, 50);

        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 20);
        g.setFont(font);
        g.drawString("Expendedou", 250, 60);
    }
}
