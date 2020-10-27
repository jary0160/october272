
package interfaceEx1;


public class WereWolf implements Monster{
    private String name;

    public WereWolf(String n){
        name=n;
    }
    
    @Override
    public void attack() {
        System.out.println("Werewolf is clawing up your back!");
    }

    @Override
    public void indentify() {
        System.out.println("I am " + name+ " the Werewolf.");
    }
    
}
