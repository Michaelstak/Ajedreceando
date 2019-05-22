/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.pro4.ajedrez.modelo;

import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;

/**
 *
 * @author utp
 */
public class Reina extends Ficha {

    public Reina(Color color) {
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
             g.fill(new Rectangle.Float(x+5, y+40, 40, 5)) ;
             g.fill(new Rectangle.Float(x+10, y+35, 30, 5)) ;
             g.fill(new Rectangle.Float(x+15, y+20, 20, 15)) ;
             g.fill(new Rectangle.Float(x+11, y+20, 28, 3)) ;
             g.fill(new Rectangle.Float(x+20, y+12, 10, 10)) ;
             g.fill(new Rectangle.Float(x+19, y+13, 12, 2)) ;
             g.fill(new Ellipse2D.Float(x + 13, y + 20, 6, 6));
             g.fill(new Ellipse2D.Float(x + 31, y + 20, 6, 6));
             g.fill(new Ellipse2D.Float(x + 13, y + 32, 6, 6));
             g.fill(new Ellipse2D.Float(x + 31, y + 32, 6, 6));
             g.fill(new Rectangle.Float(x+10, y+20, 1, 20)) ;
             g.fill(new Rectangle.Float(x+39, y+20, 1, 20)) ;
             g.fill(new Ellipse2D.Float(x + 21, y + 5, 8, 8));


        }        
}
