package GUI;

import java.awt.*;
import javax.swing.*;

/**
 * Clase que representa la ventana en la cual se vera el codigo ejecutado
 */
public class Ventana extends JFrame{
    private PanelPrincipal pp;

    /**
     * Método constructor que crea el panel
     */
    public Ventana() {
        super();

        this.setLayout(null);
        this.setTitle("Expendedou");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 720);
        this.setVisible(true);
        this.setResizable(false);
        
        pp = new PanelPrincipal();
        this.add(pp);
        
        ImageIcon image = new ImageIcon("ingenieria.jpg");
        this.setIconImage(image.getImage());
    }
}
