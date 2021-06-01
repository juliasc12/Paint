package paint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author julia
 */
public class Retangulo extends D2 {

    int base, altura;

    public void desenhar(Graphics g, Boolean fundo) {
        super.desenhar(g);
        if (fundo) {
            g.setColor(corFundo);
            g.fillRect(x, y, base, altura);
        }
        g.setColor(cor);
        g.drawRect(x, y, base, altura);
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * base + 2 * altura;
    }

}
