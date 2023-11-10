package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa el panel del comprador
 */
public class PanelComprador extends JPanel{
    private PanelMonedas pm;
    private PanelNumPadExpendedor pnexp;

    /**
     * Método constructor que crea el panel
     */
    public PanelComprador() {

        pm = new PanelMonedas();
        pnexp = new PanelNumPadExpendedor();

        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(540, 720));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        this.add(pm, BorderLayout.NORTH);
        this.add(pnexp, BorderLayout.CENTER);
    }
}
