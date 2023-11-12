package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa el panel del comprador
 */
public class PanelComprador extends JPanel{
	private Moneda100 pm100;
	private Moneda500 pm500;
	private Moneda1000 pm1000;
	private Moneda1500 pm1500;
	private PanelNumPadExpendedor pnp;

    /**
     * Método constructor que crea el panel
     */
    public PanelComprador() {       
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        this.setBounds(540,0,1080,720);
        pm100 = new Moneda100(this);
        pm500 = new Moneda500(this);
        pm1000 = new Moneda1000(this);
        pm1500 = new Moneda1500(this);
        pnp = new PanelNumPadExpendedor(this);
    	this.add(pm100);
        this.add(pm500);
        this.add(pm1000);
        this.add(pm1500);
        this.add(pnp);
    }
    /**
     * Método que que hace visible al panel, ademas de hacer que se pueda interactuar con el panel de todas las monedas en el panel
     */
    public void siMonedas() {
    	pm100.mostrar();
    	pm500.mostrar();
    	pm1000.mostrar();
    	pm1500.mostrar();
    }

    /**
     * Método que hace invisible al panel, ademas de hacer que se deje de poder interactuar con el panel de todas las monedas en el panel
     */
    public void noMonedas() {
    	pm100.esconder();
    	pm500.esconder();
    	pm1000.esconder();
    	pm1500.esconder();
    }
    /**
     * Método que hace visible al panel del numpad en el panel
     */
    public void siNumPad() {
    	pnp.mostrar();
    }
    /**
     * Método que hace invisible al panel del numpad en el panel
     */
    public void noNumPad() {
    	pnp.esconder();
    }
}

