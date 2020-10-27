
package employeeProject.staticExample;

/*
static variables - are NOT instance variables, which apply to an individual object. They are CLASS-LEVEL variables that apply to the entire class.
static methods - abilities of the entire CLASS and not an individual object / instance. These are run through the class itself and not an object.
*/


public class Blob {
    private String name;
    //blobCount applies to entire class, not
    //individual blobs
    private static int blobCount=0;
    
    // instances of Blob can modify a static variable
    //when we construct a Blob it increases count by 1
    public Blob(String n){
        name = n;
        blobCount++;
    }
    
    public String getName(){
        return name;
    }
    
    public static int getBlobCount(){
        //name = "Nothing";
        return blobCount;
    }
    
}
