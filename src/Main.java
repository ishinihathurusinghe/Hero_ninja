public class Main {
    public static void main(String[] args){
        SuperNinja superninja1 = new SuperNinja("Ninja1",5);
        Devil devil1 = new Devil("Devil1",5);

        devil1.attack(superninja1);
        devil1.attack(superninja1);
        devil1.attack(superninja1);
        devil1.attack(superninja1);
        devil1.attack(superninja1);
        devil1.attack(superninja1);
        devil1.attack(superninja1);
        devil1.attack(superninja1);
        superninja1.increaseHealth();


    }
}