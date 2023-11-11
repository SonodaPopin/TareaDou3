package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Clase que representa el panel donde uno ingresa las monedas
 */
public class PanelIngresarMoneda extends JPanel implements MouseListener{
<<<<<<< HEAD
	PanelComprador n;
    PanelIngresarMoneda(PanelComprador n){
=======
	JLabel label;

	/**
	 * Método constructor que crea el panel
	 */
    PanelIngresarMoneda(){
>>>>>>> c5495c414f3078cffb7d0f1f9a011a516d773b2d
        this.setBounds(10,100,110,110);
        this.addMouseListener(this);
        this.n = n;
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
		n.siMonedas();		
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