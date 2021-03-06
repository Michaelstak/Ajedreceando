/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.pro4.ajedrez.modelo;

import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author utp
 */
public class Peon extends Ficha {

    public Peon(Color color) {
        super(color);
    }

    @Override
   public boolean mover(int fi, int ci, int ff, int cf) {
    if(fi==2||fi==7){
        if (ci==cf && fi==ff+2){
            return true;}
        if (ci==cf && fi==ff+1){
            return true;}
    }
    if (ci==cf && fi==ff+1){
        return true;
    }
    else{
        return false;
    }
   }
    @Override
    public void comer() {
        //TODO: Comer como peon
    }

    @Override
    public void draw(Graphics2D g, float x, float y) {
        GeneralPath polyline = new GeneralPath(GeneralPath.WIND_EVEN_ODD, 17);
        

        g.setPaint(new GradientPaint(x, y,
                getColor() == Color.BLANCO ? java.awt.Color.BLACK : java.awt.Color.LIGHT_GRAY,
                x + 150, y + 0,
                java.awt.Color.WHITE));
        g.fill(new Ellipse2D.Float(x + 20, y + 10, 10, 10));
        g.fill(new Rectangle2D.Float(x + 10, y + 35, 30, 5));
        g.fill(new Rectangle2D.Float(x + 15, y + 30, 20, 5));
        g.fill(new Rectangle2D.Float(x + 23, y + 15, 5, 15));
        g.fill(new Rectangle2D.Float(x + 15, y + 20, 20, 3));
                g.setColor(java.awt.Color.RED);
        g.draw(polyline);
    }
}
