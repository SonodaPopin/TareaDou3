package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Moneda100 extends JPanel implements MouseListener{
	PanelComprador n;
    Moneda100(PanelComprador n) {
        this.setBackground(Color.GRAY);
        this.setBounds(70,160,200,200);
        this.setVisible(false);
        this.n = n;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GREEN);
        g.fillOval(20, 20, 160, 160);
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("$100", 60, 110);
    }
    public void mostrar() {
    	this.setVisible(true);
    	this.addMouseListener(this);
    }
    public void esconder() {
    	this.setVisible(false);
    	this.removeMouseListener(this);
    }
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("hola");
		n.noMonedas();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

