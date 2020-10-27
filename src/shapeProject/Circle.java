
package shapeProject;


import TurtleGraphics.Pen;


public class Circle extends Shape{
    //xPos and yPos are inerited from shape
    protected double radius;
    //only avaible here and to child class (parent and child exclusive)
    
    public Circle(){
        super(); // up to shape
        radius=1;
    }
    public Circle (double x, double y, double r){
        super(x,y);
        radius=r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        double side = 2 * Math.PI * radius / 20;
        //120 sided shape
        p.up();
        p.move(xPos,yPos);
        // go to edge
        p.setDirection(0);
        p.move(radius);
        p.setDirection(90);
        p.down();
        for (int i = 1; i <=120; i++) {
            p.move(side);
            p.turn(3); //120 * 3 = 360 degreees            
        }
    }



    @Override
    public void stretchBy(double factor) {
        radius *= factor;
        //radius = factor * radius;
    }
    
    @Override
    public String toString(){
        String  str = "CIRCLE\n";
        str+= "Radius: " + radius + "\n";
        str += "Perimeter: " + perimeter() + "\n" ;
        str+= super.toString();
        return str;
        
    }

    @Override
    public double perimeter() {
        return Math.PI *2 *radius;
    }
    
}
