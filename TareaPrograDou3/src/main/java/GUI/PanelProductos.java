package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa el panel de los productos
 */
public class PanelProductos extends JPanel {
    /**
     * Método constructor que crea el panel
     */
    PanelProductos() {
        this.setBounds(130,100,400,480);
        this.setBackground(Color.GRAY);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.green);
        g.fillRect(30, 30, 100, 200);
        g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.BOLD, 15);
        g.setFont(font);
        g.drawString("Sprite", 55, 60);
        g.drawString("Precio: 300", 40, 210);


        g.setColor(Color.cyan);
        g.fillRect(150, 30, 100, 200);
        g.setColor(Color.BLACK);
        g.drawString("CocaCola", 165, 60);
        g.drawString("Precio: 500", 160, 210);

        g.setColor(Color.ORANGE);
        g.fillRect(270, 30, 100, 200);
        g.setColor(Color.BLACK);
        g.drawString("Fanta", 295, 60);
        g.drawString("Precio: 400", 280, 210);

        g.setColor(Color.PINK);
        g.fillRect(210, 250, 100, 200);
        g.setColor(Color.BLACK);
        g.drawString("Super8", 235, 280);
        g.drawString("Precio: 700", 220, 430);

        g.setColor(Color.WHITE);
        g.fillRect(90, 250, 100, 200);
        g.setColor(Color.BLACK);
        g.drawString("Snicker", 115, 280);
        g.drawString("Precio: 1000", 95, 430);
    }
}
