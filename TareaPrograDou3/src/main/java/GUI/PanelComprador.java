package GUI;

import javax.swing.*;
import java.awt.*;
public class PanelComprador extends JPanel{
    private PanelMonedas pm;
    private PanelNumPadExpendedor pnexp;
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
