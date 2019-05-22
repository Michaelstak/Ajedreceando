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
public class Caballo extends Ficha {

    public Caballo(Color color) {
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
                getColor() == Color.BLANCO ? java.awt.Color.PINK : java.awt.Color.RED,
                x + 100, y + 50,
                java.awt.Color.WHITE));
int juan=(int)x+20;        
int jos=(int)x+20;        
int jes=(int)x+25;        
int jua=(int)x+22;        
int jin=(int)x+17;        
int jeis=(int)x+15;        
int jete=(int)x+12;        
int josho=(int)x+12;        
int jueve=(int)x+22;        
int jie=(int)x+25;        
int jon=(int)x+27;        
int jose=(int)x+29;        
int jese=(int)x+32;        
int jatoce=(int)x+35;        
int jinje=(int)x+36;        
int jejije=(int)x+32;        
int jejijete=(int)x+33;        
int jejijojo=(int)x+32;

int pun=(int)y+35;
int pon=(int)y+30;
int pen=(int)y+21;
int pan=(int)y+21;
int pin=(int)y+25;
int peis=(int)y+24;
int piete=(int)y+21;
int pocho=(int)y+18;
int pueve=(int)y+10;
int pie=(int)y+9;
int ponc=(int)y+5;
int poce=(int)y+9;
int pece=(int)y+11;
int patoce=(int)y+15;
int pince=(int)y+20;
int pencie=(int)y+28;
int pesisete=(int)y+33;
int pesisoto=(int)y+35;
int c[] = {juan, jos, jes, jua, jin ,jeis, jete, josho,jueve,jie,jon,jose,jese,jatoce,jinje,jejije,jejijete,jejijojo};
int d[] = {pun,pon,pen,pan,pin,peis,piete,pocho,pueve,pie, ponc,poce,pece,patoce,pince,pencie,pesisete,pesisoto};
g.fillPolygon(c, d, 18);
g.fill(new Rectangle.Float(x+5, y+40, 40, 5)) ;
        g.fill(new Rectangle.Float(x+13, y+35, 24,5)) ;
g.setColor(java.awt.Color.RED);
        g.draw(polyline);
    }    
}
