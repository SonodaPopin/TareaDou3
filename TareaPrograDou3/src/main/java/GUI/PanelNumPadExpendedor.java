package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelNumPadExpendedor extends JPanel {
    PanelNumPadExpendedor(){
        JPanel gPanel = new JPanel();
        gPanel.setLayout(new GridLayout(3, 2));
        gPanel.add(new JButton("1"));
        gPanel.add(new JButton("2"));
        gPanel.add(new JButton("3"));
        gPanel.add(new JButton("4"));
        gPanel.add(new JButton("5"));
    }
}