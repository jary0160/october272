
package shapeProject;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;


public class ShapeTester {

  
    public static void main(String[] args) {
        Pen p = new StandardPen (new SketchPadWindow(800,600));
        //Shape s = new Shape(); not allowed
        Shape a = new Wheel(100,100,50,6); //ok
        a.draw(p);
        Scanner s = new Scanner(System.in);
        System.out.println("Press <enetr> to change wheel to rectangle");
        
        
        s.nextLine();
        p.setColor(Color.white);
        a.draw(p);
        a=makeOneShapeFromAnother(a,1);
        p.setColor(Color.blue);
        Shape b = new Rect(); //ok
        
        Circle c = new Wheel(); // ok Parent can be a child
        Circle cc = new Circle();
        // c is both a circle and a wheel
        // c is also a shape
        Wheel w = new Wheel(); // w is  a wheel, circl eand shape
        //Wheel w = new Circle(); no chld can be parent
        //All wheels are circles, but all circles are
        //not neccessarily wheel
        System.out.println("Is c a shape? -> " + (c instanceof Shape));//t
        System.out.println("Is c a circ;e? -> " + (c instanceof Circle));//t
        System.out.println("Is c a wheel? -> " + (c instanceof Wheel));//t
        System.out.println("Is w a circle? -> " + (w instanceof Circle));//t
        System.out.println("Is cc a circle? -> " + (cc instanceof Wheel));//f
        
    }
    public static Shape makeOneShapeFromAnother(Shape inShape, int type){
        //1=rect, 2=circle, 3= wheel
        Shape outShape;
        if(type==1){
            double area = inShape.area();
            return new Rect(inShape.getXPos(), inShape.getYPos(),
                                Math.sqrt(area), Math.sqrt(area));
        }
        else if (type==2){
            double area = inShape.area();
            double rad = Math.sqrt(area/Math.PI);
            return new Circle(inShape.getXPos(), inShape.getYPos(), rad);
        }
        else{
            double area = inShape.area();
            double rad = Math.sqrt(area/Math.PI);
            return new Wheel(inShape.getXPos(), inShape.getYPos(), rad,5);
        }
        
    }
}
