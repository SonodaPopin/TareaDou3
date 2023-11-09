package GUI;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    private PanelPrincipal pp;

    public Ventana() {
        super();

        this.setLayout(new BorderLayout());
        this.setTitle("DOU");

        pp = new PanelPrincipal();

        this.add(pp, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(540, 720);
        this.setVisible(true);
        this.setResizable(false);
        ImageIcon image = new ImageIcon("ingenieria.jpg");
        this.setIconImage(image.getImage());
    }
}
