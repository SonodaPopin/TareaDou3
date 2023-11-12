package GUI;

import javax.swing.*;
import java.awt.*;

import static Logica.Inventario.getNombre;
import static Logica.Inventario.getPrecio;

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

        g.setColor(Color.RED);
        g.fillRect(30, 30, 100, 200);
        g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.BOLD, 15);
        g.setFont(font);
        g.drawString(getNombre(0), 35, 65);
        g.drawString("N°: 0", 35,45);
        g.drawString("Precio: " + String.valueOf(getPrecio(0)), 35, 210);

        g.setColor(Color.GREEN);
        g.fillRect(150, 30, 100, 200);
        g.setColor(Color.BLACK);
        g.drawString(getNombre(1), 170, 65);
        g.drawString("N°: 1", 155,45);
        g.drawString("Precio: " + String.valueOf(getPrecio(1)), 155, 210);

        g.setColor(Color.ORANGE);
        g.fillRect(270, 30, 100, 200);
        g.setColor(Color.BLACK);
        g.drawString(getNombre(2), 295, 65);
        g.drawString("N°: 2", 275,45);
        g.drawString("Precio: " + String.valueOf(getPrecio(2)), 275, 210);

        g.setColor(Color.WHITE);
        g.fillRect(90, 250, 100, 200);
        g.setColor(Color.BLACK);
        g.drawString(getNombre(3), 110, 285);
        g.drawString("N°: 3", 95,265);
        g.drawString("Precio: " + String.valueOf(getPrecio(3)), 95, 430);

        g.setColor(Color.PINK);
        g.fillRect(210, 250, 100, 200);
        g.setColor(Color.BLACK);
        g.drawString(getNombre(4), 225, 285);
        g.drawString("N°: 4", 215,265);
        g.drawString("Precio: " + String.valueOf(getPrecio(4)), 215, 430);
    }
}
