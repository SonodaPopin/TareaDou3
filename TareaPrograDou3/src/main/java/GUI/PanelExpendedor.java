package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private PanelNumPadExpendedor npexp;
    private PanelProductoComprado ppc;
    private PanelMonedas pm;
    private PanelProductos ppr;

    public PanelExpendedor() {
        npexp = new PanelNumPadExpendedor();
        ppc = new PanelProductoComprado();
        pm = new PanelMonedas();
        ppr = new PanelProductos();

        // Configura el panel del expendedor
        this.setBackground(Color.PINK);
        this.setLayout(new BorderLayout());

        this.add(npexp, BorderLayout.WEST);
        this.add(ppc, BorderLayout.SOUTH);
        this.add(ppr, BorderLayout.CENTER);
        this.add(pm, BorderLayout.NORTH);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        npexp.paintComponents(g);
        ppc.paintComponents(g);
        ppr.paintComponents(g);
        pm.paintComponents(g);
        // Dibuja los componentes relacionados con el expendedor aquí
    }
}