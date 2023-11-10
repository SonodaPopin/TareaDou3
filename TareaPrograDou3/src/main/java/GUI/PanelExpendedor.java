package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelExpendedor extends JPanel implements MouseListener{
	private PanelProductos pp;
    private PanelProductoComprado ppc;
    private PanelIngresarMoneda pim;
    private PanelNumPad pnp;
    private PanelRecibirVuelto prv;
    private PanelRellenar pr;
    public PanelExpendedor() {
    	pim = new PanelIngresarMoneda();
        ppc = new PanelProductoComprado();
        pp = new PanelProductos();
        pnp = new PanelNumPad();
        prv = new PanelRecibirVuelto();
        pr = new PanelRellenar();
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);
        this.setBounds(0,0,540,720);
        
        this.add(ppc);
        this.add(pim);
        this.add(pp);
        this.add(pnp);
        this.add(prv);
        this.add(pr);    }
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("hola");
		
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}