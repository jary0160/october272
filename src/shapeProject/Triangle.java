
package shapeProject;

import TurtleGraphics.Pen;


public class Triangle extends Shape {
    
    //only avaible here and to child class (parent and child exclusive)
    private double x2, y2, x3, y3;
     
    
    public Triangle(){
        super(); // up to shape
        x2=0;
        x3=0;
        y2=0;
        y3=0;
    }
    public Triangle (double xPos, double yPos, double x2, double y2, double x3, double y3){
        super(xPos, yPos);
        this.x2=x2;
        this.x3=x2;
        this.y2=y2;
        this.y3=y3;
        
        
    }

    @Override
    public double area() {
        return Math.abs((xPos*y2-x2*yPos)  + (x2*y3-x3*y2) + (x3*yPos-xPos*y3)) /2;
    }
    
     public void move(double xLoc, double yLoc, double x, double y) {
        double diffx=x-xPos;
        double diffy=y-yPos;
        xPos+=diffx;
        yPos+=diffy;
        x2+=diffx;
        y2+=diffy;
        x3+=diffx;
        y3+=diffy;
    }
    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos,yPos);
        p.down();
        p.move(x2,y2);
        p.move(x3,y3);
        p.move(xPos,yPos);
       
    }



    @Override
    public void stretchBy(double factor) {
        x2= (x2-xPos) * factor +xPos;
        y2= (y2-yPos) * factor +yPos;
        x3= (x3-xPos) * factor +xPos;
        y3= (y3-yPos) * factor +yPos;

        //radius = factor * radius;
    }
        
    

    @Override
    public double perimeter() {
        return Math.sqrt((xPos-x2)*(xPos-x2) + (yPos-y2) * (yPos-y2));
        
    }

    public String toString(){
        String str = ("(x,y) = (" + xPos + ", " + yPos + ")\n");
        str = ("(x2,y2) = (" + x2 + ", " + y2 + ")\n");
        str = ("(x3,y3) = (" + x3 + ", " + y3 + ")\n");
        str+= "Area: " + area() + "\n";
        str += "Perimeter: " + perimeter() + "\n" ;
        str+= super.toString();
        return str;
    }

}