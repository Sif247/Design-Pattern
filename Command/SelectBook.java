package Command;

public class SelectBook implements Command
{
    Book book;
    public SelectBook (Book book)
    {
        this.book = book;
    }

    @Override
    public void execute() {
        book.sell();
    }
}
