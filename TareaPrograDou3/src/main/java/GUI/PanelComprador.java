package GUI;

import javax.swing.*;
import java.awt.*;
public class PanelComprador extends JPanel{
    public PanelComprador() {
        
        this.setBackground(Color.BLUE);
        this.setPreferredSize(new Dimension(540, 720));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
