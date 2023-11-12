package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa un panel de numeros de un expendedor en el comprador
 */
public class PanelNumPadExpendedor extends JPanel {
	PanelComprador n;

    /**
     * Método constructor que crea el panel
     * @param n PanelComprador que se quiere modificar
     */
    PanelNumPadExpendedor(PanelComprador n){
        this.setBounds(70,160,400,400);
        this.setLayout(new GridLayout(4, 3));
        this.setVisible(false);
        this.n = n;
        
        JButton cero = new JButton("0");
        JButton uno = new JButton("1");
        JButton dos = new JButton("2");
        JButton tres = new JButton("3");
        JButton cuatro = new JButton("4");
        JButton cinco = new JButton("5");
        JButton seis = new JButton("6");
        JButton siete = new JButton("7");
        JButton ocho = new JButton("8");
        JButton nueve = new JButton("9");
        JButton cancel = new JButton("Cancel");
        JButton enter = new JButton("Enter");
        cero.addActionListener(e -> System.out.println("0"));
        uno.addActionListener(e -> System.out.println("1"));
        dos.addActionListener(e -> System.out.println("2"));
        tres.addActionListener(e -> System.out.println("3"));
        cuatro.addActionListener(e -> System.out.println("4"));
        cinco.addActionListener(e -> System.out.println("5"));
        seis.addActionListener(e -> System.out.println("6"));
        siete.addActionListener(e -> System.out.println("7"));
        ocho.addActionListener(e -> System.out.println("8"));
        nueve.addActionListener(e -> System.out.println("9"));
        cancel.addActionListener(e -> n.noNumPad());
        enter.addActionListener(e -> System.out.println(":)"));
       
        this.add(uno);
        this.add(dos);
        this.add(tres);
        this.add(cuatro);
        this.add(cinco);
        this.add(seis);
        this.add(siete);
        this.add(ocho);
        this.add(nueve);
        this.add(cancel);
        this.add(cero);
        this.add(enter);
    }
    /**
     * Método que hace visible al panel del numpad
     */
    public void mostrar() {
    	this.setVisible(true);
    }
    /**
     * Método que hace invisible al panel del numpad
     */
    public void esconder() {
    	this.setVisible(false);
    }
}