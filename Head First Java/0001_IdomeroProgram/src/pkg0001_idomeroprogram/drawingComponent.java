package pkg0001_idomeroprogram;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;

import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class drawingComponent extends JComponent{
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        Color red = new Color(255,0,0);
        g2.setColor(red);
        
        Rectangle rect1 = new Rectangle(250,100,100,200);
        g2.fill(rect1);
        
        g2.setColor(new Color(0,0,255));
        
        Ellipse2D.Double ellipse1 = new Ellipse2D.Double(100,100,50,20);
        g2.fill(ellipse1);
        
        g2.setColor(Color.MAGENTA);
        
        Line2D.Double line1 = new Line2D.Double(150,150,100,50);
        g2.draw(line1);
        
        g2.setColor(Color.blue);
        
        Point2D.Double p1 = new Point2D.Double(200, 200);
        Point2D.Double p2 = new Point2D.Double(500, 200);
        
        Line2D.Double line2 = new Line2D.Double(p1,p2);
        g2.draw(line2);
    }

}
