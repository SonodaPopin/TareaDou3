package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelRellenar extends JPanel implements MouseListener{
    PanelRellenar(){
        this.setBounds(205,25,250,50);
        this.addMouseListener(this);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, 300, 300);

        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 22);
        g.setFont(font);
        g.drawString("Expendedou", 60, 30);
    }
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("hola");	
	}
	@Override
	public void mousePressed(MouseEvent e) {	
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
        this.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
	}
	@Override
	public void mouseExited(MouseEvent e) {
		this.setBorder(BorderFactory.createEmptyBorder());
	}
}
