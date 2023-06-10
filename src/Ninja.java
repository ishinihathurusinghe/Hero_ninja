public abstract class Ninja extends GameCharacter {
    private boolean armor;

    public Ninja(String name, int health) {
        super(name, health);
        // creating a ninja with armor
        this.armor = true;
    }

    public boolean isArmor() {
        return armor;
    }

    public void setArmor(boolean armor) {
        this.armor = armor;
    }

    public void looseHealth() {

        if (this.isArmor()){
            this.setHealth(this.getHealth() - 1);
        }else {
            this.setHealth(this.getHealth() - 2);
        }


        if (this.getHealth() == 0) {
            System.out.println(this.getName() + " just died");
        } else if (this.getHealth() < 0) {
            System.out.println(this.getName() + " already died");
        } else {
            System.out.println(this.getName() + ": health decreased to " + this.getHealth());
        }
    }

    public void looseArmor() {
        if (this.isArmor()) {
            this.setArmor(false);
            System.out.println(this.getName() + " armor stolen");
        } else {
            System.out.println(this.getName() + " doesn't have an armor");
        }
    }


    public abstract void attack(Devil devil);


    public void gainArmor(){

        if(this.getHealth()<=0){
            System.out.println(this.getName()+" cannot gain armor");
        }else {
            if(this.isArmor()){
                System.out.println(this.getName()+" already has an armor");
            }else {
                this.setArmor(true);
                System.out.println(this.getName()+" armor gained");
            }
        }



    }
}

















