package Strategy.VideoGioco;

public class King extends Character {
    public King() {
        fightBehavior = new
                KnifeBehavior();
    }
    public void display() {
        System.out.println("I'm a king");
    }
}
