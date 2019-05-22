/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.pro4.ajedrez.modelo;

import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;

/**
 *
 * @author utp
 */
public class Rey extends Ficha {

    public Rey(Color color) {
        super(color);
    }

    @Override
    public void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Graphics2D g, float x, float y) {
        GeneralPath polyline = new GeneralPath(GeneralPath.WIND_EVEN_ODD, 17);
        

        g.setPaint(new GradientPaint(x, y,
                getColor() == Color.BLANCO ? java.awt.Color.BLACK : java.awt.Color.LIGHT_GRAY,
                x + 150, y + 0,
                java.awt.Color.WHITE));
                    g.fill(new Rectangle.Float(x+5, y+40, 40, 5)) ;
                    g.fill(new Rectangle.Float(x+10, y+35, 30, 5)) ;
                    g.fill(new Rectangle.Float(x+15, y+25, 20, 20)) ;
                    g.fill(new Rectangle.Float(x+11, y+23, 28, 3)) ;
                    g.fill(new Rectangle.Float(x+20, y+13, 10, 10)) ;
                    g.fill(new Rectangle.Float(x+18, y+10, 14, 3)) ;
                    g.fill(new Rectangle.Float(x+24, y+5, 2, 6)) ;
                    g.fill(new Rectangle.Float(x+22, y+7, 6, 2)) ;

    }

}
