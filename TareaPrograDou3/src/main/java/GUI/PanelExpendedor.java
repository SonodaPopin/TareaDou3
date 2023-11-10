package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private PanelProductoComprado ppc;
    private PanelProductos ppr;
    private PanelExpendedorLadoDer peld;
    private PanelExpendedorArriba pea;
    private PanelExpendedorLadoIzq peli;

    public PanelExpendedor() {
        ppc = new PanelProductoComprado();
        ppr = new PanelProductos();
        peld = new PanelExpendedorLadoDer();
        pea = new PanelExpendedorArriba();
        peli = new PanelExpendedorLadoIzq();

        this.setBackground(Color.PINK);
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(540, 720));

        this.add(peli, BorderLayout.WEST);
        this.add(pea, BorderLayout.NORTH);
        this.add(peld, BorderLayout.EAST);
        this.add(ppc, BorderLayout.SOUTH);
        this.add(ppr, BorderLayout.CENTER);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ppc.paintComponents(g);
        ppr.paintComponents(g);
    }
}