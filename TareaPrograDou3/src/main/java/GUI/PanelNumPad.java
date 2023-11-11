package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelNumPad extends JPanel implements MouseListener{
	PanelComprador n;
    PanelNumPad(PanelComprador n){
        this.setBounds(10,250,110,180);
        this.addMouseListener(this);
        this.n = n;
    }
    @Override
    protected void paintComponent(Graphics g) {
        Font font = new Font("Arial", Font.BOLD, 10);
        g.setFont(font);
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, 200, 200);
        
        g.setColor(Color.WHITE);
        g.drawString("  Elija su producto", 5, 20);
        
        drawNumber(g, "1", 5, 35);
        drawNumber(g, "2", 40, 35);
        drawNumber(g, "3", 75, 35);
        drawNumber(g, "4", 5, 70);
        drawNumber(g, "5", 40, 70);
        drawNumber(g, "6", 75, 70);
        drawNumber(g, "7", 5, 105);
        drawNumber(g, "8", 40, 105);
        drawNumber(g, "9", 75, 105);
        drawNumber(g, "0", 40, 140); 
    }
    private void drawNumber(Graphics g, String number, int x, int y) {

        g.setColor(Color.WHITE);
        g.fillRect(x, y, 30, 30);

        g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.BOLD, 12);
        g.setFont(font);
        FontMetrics metrics = g.getFontMetrics(font);
        int stringWidth = metrics.stringWidth(number);
        int stringHeight = metrics.getHeight();
        g.drawString(number, x + (30 - stringWidth) / 2, y + (30 - stringHeight) / 2 + metrics.getAscent());
    }
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("hola");	
		n.siNumPad();
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