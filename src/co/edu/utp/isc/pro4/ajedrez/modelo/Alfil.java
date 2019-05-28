/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.pro4.ajedrez.modelo;

import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import static java.lang.Math.abs;

/**
 *
 * @author utp
 */
public class Alfil extends Ficha {

    public Alfil(Color color) {
        super(color);
    }

    @Override
   public boolean mover(int fi, int ci, int ff, int cf) {
        System.out.println(String.valueOf(fi)+' '+String.valueOf(ci)+' '+String.valueOf(ff)+' '+String.valueOf(cf));
        if(abs(fi-ff)==abs(ci-cf)){
            return true;
        }else{
            return false;
        }            
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
        g.fill(new Ellipse2D.Float(x+23, y+10, 4, 4));
        g.fill(new Ellipse2D.Float(x+21, y+15, 8, 8));
        g.fill(new Rectangle.Float(x+5, y+40, 40, 5)) ;
        g.fill(new Rectangle.Float(x+13, y+35, 24,5)) ;
        g.fill(new Rectangle.Float(x+22, y+25, 6, 10)) ;
        g.fill(new Rectangle.Float(x+17, y+29, 16, 3)) ;
        g.fill(new Rectangle.Float(x+24, y+20, 3, 5)) ;
        int uno=(int)x+22;
        int dos=(int)x+28;
        int tres=(int)x+25;
        int Yuno=(int)y+19;
        int Yos=(int)y+19;
        int Yes=(int)y+10;
        int a[] = {uno, dos, tres};
        int b[] = {Yuno, Yos, Yes};
        g.fillPolygon(a, b, 3);
        int wuno=(int) x+21;
        int wos=(int) x+21;
        int wes =(int) x+30;
        int zuno =(int) y+14;
        int zos =(int) y+19;
        int zes =(int) y+19;
        
        int w[] = {wuno,wos, wes};
        int z[] = {zuno, zos, zes}; 
        g.fill(new Polygon(w, z, 3)) ;
        
        g.setColor(java.awt.Color.RED);
        g.draw(polyline);

    }
    
}
