import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("DOU");

        this.add(new JButton("norte"),BorderLayout.NORTH);
        //this.add(new JButton("este"),BorderLayout.EAST);
        //this.add(new JButton("oeste"),BorderLayout.WEST);
        this.add(new JButton("centro"),BorderLayout.CENTER);
        this.add(new JButton("sur"),BorderLayout.SOUTH);
        this.add(new PanelComprador(),BorderLayout.WEST);
        this.add(new PanelExpendedor(),BorderLayout.EAST);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setVisible(true);
    }
}
