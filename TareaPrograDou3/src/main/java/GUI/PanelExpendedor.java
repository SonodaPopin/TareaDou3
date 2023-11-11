package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel{
	private PanelProductos pp;
    private PanelProductoComprado ppc;
    private PanelIngresarMoneda pim;
    private PanelNumPad pnp;
    private PanelRecibirVuelto prv;
    private PanelRellenar pr;
    public PanelExpendedor(PanelComprador n) {
    	pim = new PanelIngresarMoneda(n);
        ppc = new PanelProductoComprado();
        pp = new PanelProductos();
        pnp = new PanelNumPad(n);
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
        this.add(pr);    
        }
}