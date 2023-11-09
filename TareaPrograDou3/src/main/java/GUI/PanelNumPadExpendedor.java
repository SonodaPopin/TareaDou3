package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelNumPadExpendedor extends JPanel {
    PanelNumPadExpendedor(){
        super();

        this.setBackground(Color.LIGHT_GRAY);

        JPanel gPanel = new JPanel();
        gPanel.setLayout(new GridLayout(2, 3));
        gPanel.add(new JButton("1"));
        gPanel.add(new JButton("2"));
        gPanel.add(new JButton("3"));
        gPanel.add(new JButton("4"));
        gPanel.add(new JButton("5"));

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(Box.createVerticalGlue());
        this.add(gPanel);
        this.add(Box.createVerticalGlue());
    }
}