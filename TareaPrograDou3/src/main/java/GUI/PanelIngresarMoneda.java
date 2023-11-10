package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelIngresarMoneda extends JPanel implements MouseListener{
	JLabel label;
    PanelIngresarMoneda(){
        this.setBounds(10,100,110,110);
        this.addMouseListener(this);
    }
    @Override
    protected void paintComponent(Graphics g) {
        Font font = new Font("Arial", Font.BOLD, 10);
        g.setFont(font);
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, 200, 200);

        g.setColor(Color.GRAY);
        g.fillRect(15, 30, 15, 70);
        
        g.setColor(Color.WHITE);
        g.drawString(" Ingrese su Moneda", 5, 20);
        
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