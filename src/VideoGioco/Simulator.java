package VideoGioco;

public class Simulator{
    public static void main(String[] args) {
        Character lion= new King();
        lion.performFight();

        Character alieno = new Alien();
        alieno.performMove();
        alieno.performFight();

        Character guerriero = new Warrior();
        guerriero.performMove();
        guerriero.performMove2();
        guerriero.performFight();
        guerriero.performFight2();
    }
}
