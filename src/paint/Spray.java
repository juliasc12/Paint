package paint;

import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author julia
 */

public class Spray extends Ponto {

    int diametro = 50;
   
    @Override
    public void desenhar(Graphics g) {
        g.setColor(cor);
        Random posRandom = new Random();
        for (int i = 0; i < 300; i++) {
            int posx = posRandom.nextInt(diametro)+x - diametro/2;
            int posy = posRandom.nextInt(diametro)+y - diametro/2;
            
            double conta = Math.pow(posx - x, 2);
            conta += Math.pow(posy - y, 2);
            if((Math.sqrt(conta))<=diametro/2){
                g.drawLine(posx, posy, posx, posy);
            }   
        }
    }

}
