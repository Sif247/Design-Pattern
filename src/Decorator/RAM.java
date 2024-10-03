public class RAM extends PcComponents
{
    public RAM (Pc computer)
    {
        this.computer = computer;
    }

    public String getDescription()
    {
        return computer.getDescription() + " 512 Giga";
    }

    public int price()
    {
        return computer.price() + 200;
    }
}
