public class NormalNinja extends Ninja{
    public NormalNinja(String name, int health) {
        super(name, health);
    }


    public  void attack(Devil devil){
        devil.looseHealth(1);
    }
}
