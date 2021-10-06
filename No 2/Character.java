public class Character {
    private String name;
    private int lifePoint;
    private int attackHitPoint;
    private int attackKickPoint;

    //konstruktor 4 parameter
    public Character(String name, int lifePoint, int attackHitPoint, int attackKickPoint){
        this.name = name;
        this.lifePoint = lifePoint;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    //method hit
    public void hit(Character karB){
        karB.lifePoint = karB.getLifePoint() - this.attackHitPoint;
    }

    //method kick
    public void kick(Character karB){
        karB.lifePoint = karB.getLifePoint() - this.attackKickPoint;
    }

    //method
    public int getLifePoint(){
        return lifePoint;
    }

    public String getName(){
        return name;
    }
}

