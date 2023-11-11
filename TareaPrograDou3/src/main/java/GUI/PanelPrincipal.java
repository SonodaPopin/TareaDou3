package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa el panel principal que va sobre la ventana
 */
public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    /**
     * Método constructor que crea el panel
     */
    public PanelPrincipal() {
        com = new PanelComprador();
        exp = new PanelExpendedor(com);

        this.setLayout(null);
        this.setBounds(0,0,1080,720);
        this.setBackground(Color.DARK_GRAY);

        this.add(com);
        this.add(exp);
    }
}