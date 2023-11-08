package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel{
    private PanelComprador com;
    private PanelExpendedor exp;
    public PanelPrincipal (){
        exp = new PanelExpendedor();
        com = new PanelComprador();
        this.setSize(1080,720);
        this.setBackground(Color.GRAY);

        this.add(exp, BorderLayout.EAST);
        this.add(com, BorderLayout.WEST);

    }
    public void paint(Graphics g){
        super.paint(g);
        com.paint(g);
        exp.paint(g);
    }
}
