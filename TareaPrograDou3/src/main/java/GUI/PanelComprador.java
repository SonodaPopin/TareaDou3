package GUI;

import javax.swing.*;
import java.awt.*;
public class PanelComprador extends JPanel{
	private Moneda100 pm;
	private Moneda500 pmm;
	private Moneda1000 pmmm;
	private Moneda1500 pmmmm;
	private PanelNumPadExpendedor pnp;
    public PanelComprador() {       
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        this.setBounds(540,0,1080,720);
        pm = new Moneda100(this);
        pmm = new Moneda500(this);
        pmmm = new Moneda1000(this);
        pmmmm = new Moneda1500(this);
        pnp = new PanelNumPadExpendedor(this);
    	this.add(pm);
        this.add(pmm);
        this.add(pmmm);
        this.add(pmmmm);
        this.add(pnp);
    }
    public void siMonedas() {
    	pm.mostrar();
    	pmm.mostrar();
    	pmmm.mostrar();
    	pmmmm.mostrar();
    }
    public void noMonedas() {
    	pm.esconder();
    	pmm.esconder();
    	pmmm.esconder();
    	pmmmm.esconder();
    }
    public void siNumPad() {
    	pnp.mostrar();
    }
    public void noNumPad() {
    	pnp.esconder();
    }
}

