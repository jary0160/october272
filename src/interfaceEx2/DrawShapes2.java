
package interfaceEx2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;


public class DrawShapes2 {

  
    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(1000,800));
        p.setWidth(3);
        Shape shapes[] = new Shape[20];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i]=getRandomShape();
            p.setColor(getRandomColor());
            shapes[i].draw(p);
            System.out.println(shapes[i]);
            System.out.println("------------------------");
        }
    }
    public static Color getRandomColor(){
        int rr,rg,rb;
        rr = (int) (Math.random() * 256); 
        rg = (int) (Math.random() * 256); 
        rb = (int)  (Math.random()*256);
        return new Color(rr,rg,rb);
    }
    
    public static Shape getRandomShape(){
        Shape s;
        int rx,ry,rr,rw,rh,randshp,rs;
        rx = (int) (Math.random() * 600 -300); //-> -300 to +300
        ry = (int) (Math.random() * 600 -300); //-> -300 to +300
        rr = (int)  (Math.random()*100 + 10);
        rw = (int)  (Math.random()*250 + 10);
        rh = (int)  (Math.random()*250 + 10);
        rs = (int)  (Math.random()*12 + 3);
        randshp = (int)(Math.random()*3 +1); // 1 or 2
        if(randshp==1)
            s=new Rect(rx,ry,rw,rh);
        else if(randshp==2)
            s=new Circle(rx,ry,rr);
        else
            s = new Wheel(rx,ry,rr,rs);
        return s;
    }
    
}
