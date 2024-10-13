package Command;

public class Book
{
    int num;

    public Book(int num)
    {
        this.num = num;
    }
    public void sell()
    {
        num--;
        System.out.println("there are " + num + " book left");
    }
}
