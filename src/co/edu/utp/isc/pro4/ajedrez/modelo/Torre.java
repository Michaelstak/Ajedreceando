
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
public class Torre extends Ficha {

    public Torre(Color color) {
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

    public void draw(Graphics2D g, float x, float y) {
        GeneralPath polyline = new GeneralPath(GeneralPath.WIND_EVEN_ODD, 17);
        

        g.setPaint(new GradientPaint(x, y,
                getColor() == Color.BLANCO ? java.awt.Color.PINK : java.awt.Color.RED,
                x + 100, y + 50,
                java.awt.Color.WHITE));
        g.fill(polyline);
        g.fill(new Rectangle.Float(x+10, y+10, 8, 5)) ;
        g.fill(new Rectangle.Float(x+21, y+10, 8, 5)) ;
        g.fill(new Rectangle.Float(x+32, y+10, 8, 5)) ;
        
        g.fill(new Rectangle.Float(x+10, y+15, 30, 5)) ;
        g.fill(new Rectangle.Float(x+13, y+27, 24, 2)) ;
        g.fill(new Rectangle.Float(x+15, y+20, 20, 15)) ;
        g.fill(new Rectangle.Float(x+10, y+35, 30, 5)) ;
        

        g.setColor(java.awt.Color.RED);
        g.draw(polyline);
    }

}
