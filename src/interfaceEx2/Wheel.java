
package interfaceEx2;

import TurtleGraphics.Pen;


public class Wheel extends Circle {
    //wheek inherits everythig from circle
    //except constructor
    private int spokes; // wheel has 4 properties
    private static int wheelCount;
    private static int avgSize;
    public Wheel(){
        xPos=0;
        yPos=0;
        radius=0;
        spokes=3;
    }
    public Wheel (double x, double y, double r,int s){
        super(); //super means call parent contructor
        spokes=3;
        wheelCount++;
        avgSize +=area();
    }
    public static int getWheelCount(){
        return wheelCount;
    }
    public void draw(Pen p){
        //call parent draw to get the circle
        super.draw(p);
        //draw spokes
        for (int i = 1; i <= spokes; i++) {
            p.up();
            p.move(xPos,yPos);
            p.down();
            p.setDirection(i * 360 / spokes);
            p.move(radius);
        }
    }
    //exclusive method
    public void setSpokes (int s){
        spokes =s ;
    }
    
    //override the toString method()
    public String toString(){
        String  str = "WHEEL\n";
        str+= "Radius: " + radius + "\n";
        str += ("(x,y) = (" + xPos + ", " + yPos + ")\n");
        str += "Number of spokes: " + spokes + "\n";
        str+= "Area: " + area();
        return str;
        
    }
    }
