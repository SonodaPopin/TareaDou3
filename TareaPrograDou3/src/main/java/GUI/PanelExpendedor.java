package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel{
    private PanelNumPadExpendedor npexp;
    public PanelExpendedor() {
        npexp = new PanelNumPadExpendedor();
        // Configura el panel del expendedor
        this.setBackground(Color.PINK);
        this.add(npexp ,BorderLayout.WEST);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja los componentes relacionados con el expendedor aqui
    }
}
