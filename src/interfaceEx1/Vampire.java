
package interfaceEx1;


public class Vampire implements Monster{
    private String name;
    
    Vampire(String n){
        name=n;
    }

    @Override
    public void attack() {
        System.out.println("Vampire is biting your neck!");
    }

    @Override
    public void indentify() {
        System.out.println("I am " + name + " the Vampire.");
    }
    
    //this method is eclusive to vampires
    public void changeToBat(){
        System.out.println("Vampire is now a bat");
    }
    
} 
