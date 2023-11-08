package GUI;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    private PanelPrincipal pp;
    public Ventana(){
        //super();

        this.setLayout(new BorderLayout());
        this.setTitle("DOU");

        pp = new PanelPrincipal();

        this.add(pp, BorderLayout.CENTER);

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1080,720);
        this.setVisible(true);
    }
}
