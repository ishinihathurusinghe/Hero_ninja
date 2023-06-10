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


    public void looseHealth() {
        this.setHealth(this.getHealth() - 1);

        if (this.getHealth() == 0) {
            System.out.println(this.getName() + " just died");
        } else if (this.getHealth() < 0) {
            System.out.println(this.getName() + " already died");
        } else {
            System.out.println(this.getName() + ": health decreased to " + this.getHealth());
        }
    }
}
