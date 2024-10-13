package Command;

public class Botton
{
    Command choice;
    public void SetCommand(Command command)
    {
        this.choice = command;
    }

    public void buttonWasPressed()
    {
        choice.execute();
    }

}
