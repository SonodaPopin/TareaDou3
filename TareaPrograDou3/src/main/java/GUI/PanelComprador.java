package GUI;

import javax.swing.*;
import java.awt.*;
public class PanelComprador extends JPanel{
    public PanelComprador() {
        // Configura el panel del comprador
        this.setBackground(Color.BLUE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar los componentes relacionados con el comprador aqui
    }
}
