package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelProductoComprado extends JPanel implements MouseListener{
    PanelProductoComprado(){
        this.setBackground(Color.BLACK);
        this.setBounds(130, 600, 400, 70);
        this.addMouseListener(this);
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

