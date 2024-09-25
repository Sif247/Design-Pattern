package VideoGioco;

public abstract class Character{
    FightBehavior fightBehavior;
    FightBehavior fightBehavior2;
    MovePlayer movePlayer;
    MovePlayer movePlayer2;
    // more
    public void Character() {
    }
    public void performFight() {
        fightBehavior.fight();
    }
    public void performFight2() {
        fightBehavior2.fight();
    }

    public void performMove() {
        movePlayer.Move();
    }

    public void performMove2() {
        movePlayer2.Move();
    }

    public abstract void display();

}

