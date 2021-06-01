package paint;

import java.awt.Graphics;

/**
 *
 * @author julia
 */
public class Reta extends Ponto {

    int x2, y2;

    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.drawLine(x, y, x2, y2);
    }
}
