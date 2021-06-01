package paint;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julia
 */
public class Poligono extends Reta {

    List<Ponto> pontos = new ArrayList<Ponto>();

    //desenhar os pontos e salvá-los
    public void desenhar(Graphics g) {
        g.setColor(cor);

        pontos.add(new Ponto(x, y));
        g.drawLine(x, y, x, y);

    }

    public void formarPoligono(Graphics g) {
        int xPoints[] = new int[pontos.size()];
        int yPoints[] = new int[pontos.size()];

        for (int i = 0; i < pontos.size(); i++) {
            xPoints[i] = pontos.get(i).x;
            yPoints[i] = pontos.get(i).y;
        }

        for (int i = 1; i < pontos.size(); i++) {
            g.setColor(cor);
            g.drawPolygon(xPoints, yPoints, pontos.size());

        }
    }

    public void limparListaPontos() {
        pontos.clear();
    }

}
