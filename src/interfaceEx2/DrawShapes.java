
package interfaceEx2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;


public class DrawShapes {

   
    public static void main(String[] args) {
        Shape x = new Rect(0,0,200,75);
        Shape y = new Circle(50,50,100);
        Shape z = new Wheel(-200,100,75,5);
        Pen p = new StandardPen(new SketchPadWindow(800,600));
        p.setColor(Color.red);
        p.setWidth(10);
        x.draw(p);
        p.setColor(Color.green);
        y.draw(p);
        p.setColor(Color.blue);
        z.draw(p);
              
        Scanner s = new Scanner (System.in);
        System.out.println("Press <enter> to move rectangle to -200,-200");
        s.next();
        p.setColor(Color.white);
        x.draw(p);
        x.move(-200, -200);
        p.setColor(Color.red);
        x.draw(p);
        
        System.out.println("Press to resize circle by 1/2");
        s.next();
        p.setColor(Color.white);
        y.draw(p);
        y.stretchBy(.5);
        p.setColor(Color.red);
        y.draw(p);
        
        
        System.out.println("Press <enter> to change wheel spokes to 3");
        s.nextLine();
        p.setColor(Color.white);
        z.draw(p);
        //must cast because setSpokes is an exclusive method in wheel 1
        ((Wheel)z).setSpokes(3);
        p.setColor(Color.blue);
        z.draw(p);
        
    }
    
}
