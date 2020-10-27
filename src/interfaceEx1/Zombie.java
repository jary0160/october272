
package interfaceEx1;

public class Zombie implements Monster {
    private String name;
    public Zombie(String n){
    name=n;
}

    @Override
    public void attack() {
        System.out.println("Zombie is eating your brains!");
    }

    @Override
    public void indentify() {
        System.out.println("I am " + name + " The Zombie.");
    }
    
}
