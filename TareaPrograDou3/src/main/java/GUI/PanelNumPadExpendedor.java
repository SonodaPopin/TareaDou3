package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa un panel de numeros de un expendedor en el comprador
 */
public class PanelNumPadExpendedor extends JPanel {
    /**
     * Método constructor que crea el panel
     */
    PanelNumPadExpendedor(){
        super();

        this.setBackground(Color.LIGHT_GRAY);

        JPanel gPanel = new JPanel();
        gPanel.setLayout(new GridLayout(4, 3));
        gPanel.add(new JButton("1"));
        gPanel.add(new JButton("2"));
        gPanel.add(new JButton("3"));
        gPanel.add(new JButton("4"));
        gPanel.add(new JButton("5"));
        gPanel.add(new JButton("6"));
        gPanel.add(new JButton("7"));
        gPanel.add(new JButton("8"));
        gPanel.add(new JButton("9"));
        gPanel.add(new JButton("["));
        gPanel.add(new JButton("0"));
        gPanel.add(new JButton("]"));

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(Box.createVerticalGlue());
        this.add(gPanel);
        this.add(Box.createVerticalGlue());
    }
}