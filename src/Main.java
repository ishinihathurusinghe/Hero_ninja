public class Main {
    public static void main(String[] args){
        SuperNinja superNinja1 = new SuperNinja("SuperNinja1",5);

        NormalNinja normalNinja = new NormalNinja("NormalNinja1",5);

        Devil devil1 = new Devil("Devil1",5);
         devil1.stealArmor(superNinja1);
        superNinja1.attack(devil1);

        superNinja1.gainArmor();

        superNinja1.attack(devil1);
        superNinja1.attack(devil1);




    }
}