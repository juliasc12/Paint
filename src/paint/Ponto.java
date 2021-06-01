package paint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author julia
 */
public class Ponto {

    int x, y;
    Color cor;

    public Ponto() {

    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.drawLine(x, y, x, y);
    }
}
