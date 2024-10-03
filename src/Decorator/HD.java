public class HD extends Pc
{
    Pc computer;

    public HD (Pc computer)
    {
        this.computer = computer;
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + " Iris Graphics";
    }

    public int price()
    {
        return computer.price() + 200;
    }
}
