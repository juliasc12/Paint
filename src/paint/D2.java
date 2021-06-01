package paint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author julia
 */
public abstract class D2 extends Ponto {

    public boolean showArea = false;
    public Color corFundo;

    abstract public double area();

    abstract public double perimetro();

    @Override
    public void desenhar(Graphics g) {
        if (showArea) {
            g.drawString(Double.toString(area()), x, y);
        }
    }
}
