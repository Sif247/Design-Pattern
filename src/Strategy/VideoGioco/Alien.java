package Strategy.VideoGioco;

public class Alien extends Character{
    public Alien() {
        fightBehavior = new
                ToxicBlobFight();
        movePlayer = new InstantTrasport();
    }
    public void display() {
        System.out.println("I'm an alien");
    }
}
