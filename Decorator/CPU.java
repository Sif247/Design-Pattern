public class CPU extends PcComponents
{
    public CPU(Pc computer)
    {
        this.computer = computer;
    }

    public String getDescription()
    {
        return computer.getDescription()+ " Intel Core i9";
    }

    public int price()
    {
        return computer.price() + 300;
    }
}
