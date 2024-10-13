package Strategy.VideoGioco;

public class LaserGunFight implements FightBehavior{
    @Override
    public void fight() {
        System.out.println("I'm fighting with laser gun");
    }
}
