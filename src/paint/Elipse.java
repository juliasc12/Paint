package paint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author julia
 */
public class Elipse extends D2 {

    int raioHorizontal, raioVertical;

    public void desenhar(Graphics g, Boolean fundo) {
        super.desenhar(g);
        if (fundo) {
            g.setColor(corFundo);
            g.fillOval(x, y, raioHorizontal * 2, raioVertical * 2);
        }
        g.setColor(cor);
        g.drawOval(x, y, raioHorizontal * 2, raioVertical * 2);
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
