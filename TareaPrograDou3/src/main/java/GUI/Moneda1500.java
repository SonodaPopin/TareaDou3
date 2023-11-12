package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase que representa el panel de una moneda de valor 1500
 */
public class Moneda1500 extends JPanel implements MouseListener{
	PanelComprador n;
	/**
	 * Método constructor que crea el panel
	 * @param n
	 */
    Moneda1500(PanelComprador n) {
        this.setBackground(Color.GRAY);
        this.setBounds(270,360,200,200);
        this.setVisible(false);
        this.n = n;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.ORANGE);
        g.fillOval(20, 20, 160, 160);
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("$1500", 50, 110);
    }
	/**
	 * Método que hace visible al panel, ademas de hacer que se pueda interactuar con este
	 */
    public void mostrar() {
    	this.setVisible(true);
    	this.addMouseListener(this);
    }
	/**
	 * Método que hace invisible al panel, ademas de hacer que se deje de poder interactuar con este
	 */
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

