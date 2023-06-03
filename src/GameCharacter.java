public class GameCharacter {

    private String name;

    private int health;

    public GameCharacter(String name,int health){
        this.name = name;
        this.health = health;

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
