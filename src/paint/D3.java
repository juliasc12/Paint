package paint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author julia
 */
public abstract class D3 extends D2 {

    int altura;

    public boolean showVolume = false;
    public Color corFundo;

    abstract public double volume();

    @Override
    public void desenhar(Graphics g) {
        if (showVolume) {
            g.drawString(Double.toString(volume()), x, y);
        }
    }

}
