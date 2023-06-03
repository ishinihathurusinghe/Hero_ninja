public class Devil extends GameCharacter{


    public Devil(String name, int health) {
        super(name, health);
    }

    public void attack(Ninja ninja){

        ninja.looseHealth();
    }

    public void stealArmor(Ninja ninja){
       ninja.looseArmor();
    }
}
