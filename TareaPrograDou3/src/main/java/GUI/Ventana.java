package GUI;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame{
    private PanelPrincipal pp;

    public Ventana() {
        super();

        this.setLayout(null);
        this.setTitle("DOU");
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
