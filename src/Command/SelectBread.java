package Command;

public class SelectBread implements Command
{
    Bread bread;

    public SelectBread(Bread bread)
    {
        this.bread = bread;
    }

    @Override
    public void execute() {
        bread.cook();
    }
}
