package GUI;

import java.awt.*;
import javax.swing.*;

/**
 * Clase que representa una ventana
 */
public class Ventana extends JFrame {
    private PanelPrincipal pp;

    /**
     * Método constructor que crea una ventana
     */
    public Ventana() {
        super();

        this.setLayout(new BorderLayout());
        this.setTitle("Expendedou");

        pp = new PanelPrincipal();

        this.add(pp, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 720);
        this.setVisible(true);
        this.setResizable(false);
        ImageIcon image = new ImageIcon("ingenieria.jpg");
        this.setIconImage(image.getImage());
    }
}
