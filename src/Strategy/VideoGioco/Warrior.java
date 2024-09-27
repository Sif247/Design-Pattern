package Strategy.VideoGioco;

public class Warrior extends Character{
    public Warrior() {
        fightBehavior = new LaserGunFight();
        fightBehavior2 = new PlasmaRifleFight();
        movePlayer = new SubsonicMotorCycle();
        movePlayer2 = new InterstellarShip();
    }
    public void display() {
        System.out.println("I'm a warrior");
    }
}
