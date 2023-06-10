public class SuperNinja extends Ninja{
    public SuperNinja(String name, int health) {
        super(name, health);
    }


    public  void attack(Devil devil){
       devil.looseHealth(2);
    }

    public void increaseHealth(){
        if(this.getHealth() == 5){
            System.out.println(this.getName()+" cant increase");
        }
        else if (this.getHealth()<1) {
            System.out.println("already died");
        }

        else {
            this.setHealth(this.getHealth()+1);
            System.out.println(this.getName()+" increased health to"+this.getHealth());
        }
    }
}
