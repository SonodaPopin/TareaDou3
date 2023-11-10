package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa el panel principal
 */
public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    /**
     * Método constructor que crea el panel
     */
    public PanelPrincipal() {
        exp = new PanelExpendedor();
        com = new PanelComprador();

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(1080, 720));
        this.setBackground(Color.DARK_GRAY);

        this.add(com, BorderLayout.EAST);
        this.add(exp, BorderLayout.WEST);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        com.paintComponent(g);
        exp.paintComponent(g);
    }
}