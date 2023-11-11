package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase que representa el panel en donde uno recibe las monedas de vuelto
 */
public class PanelRecibirVuelto extends JPanel implements MouseListener{
	/**
	 * Método constructor que crea el panel
	 */
    PanelRecibirVuelto(){
        this.setBounds(10,470,110,110);
        this.addMouseListener(this);
    }
    @Override
    protected void paintComponent(Graphics g) {
        Font font = new Font("Arial", Font.BOLD, 10);
        g.setFont(font);
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, 200, 200);

        g.setColor(Color.GRAY);
        g.fillOval(20, 30, 70, 70);
        
        g.setColor(Color.WHITE);
        g.drawString("    Retire su vuelto", 5, 20);
        
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