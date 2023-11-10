package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedorLadoIzq extends JPanel {
    PanelExpendedorLadoIzq(){
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(115, 720));
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        int startY = (panelHeight - 4 * 35) / 2;
        int startX = (panelWidth - 3 * 35) / 2;

        g.setColor(Color.DARK_GRAY);
        g.fillRect(startX, 10, 3 * 35, startY - 60);

        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 10);
        g.setFont(font);
        g.drawString("Ingrese su Moneda", startX + 5, 30);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(startX, 380, 3 * 35, 100 );

        g.setColor(Color.GRAY);
        g.fillOval(26, 410,60 , 60);

        g.setColor(Color.WHITE);
        g.drawString("Retire su vuelto", startX + 5, 395);

        g.setColor(Color.GRAY);
        g.fillRect(startX + 10, 40, 15, startY - 100);

        g.setColor(Color.WHITE);
        drawNumber(g, "1", startX, startY);
        drawNumber(g, "2", startX + 35, startY);
        drawNumber(g, "3", startX + 70, startY);

        drawNumber(g, "4", startX, startY + 35);
        drawNumber(g, "5", startX + 35, startY + 35);
        drawNumber(g, "6", startX + 70, startY + 35);

        drawNumber(g, "7", startX, startY + 70);
        drawNumber(g, "8", startX + 35, startY + 70);
        drawNumber(g, "9", startX + 70, startY + 70);

        drawNumber(g, "0", startX + 35, startY + 105);
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
}