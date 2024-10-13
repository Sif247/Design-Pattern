package Command;

public class Test {
    public static void main(String[] args) {
        Botton scelta1 = new Botton();
        Botton scelta2 = new Botton();

        Book book = new Book(100);
        Bread bread = new Bread();

        SelectBook selectBook = new SelectBook(book);
        SelectBread selectBread = new SelectBread(bread);

        scelta1.SetCommand(selectBread);
        scelta2.SetCommand(selectBook);
        scelta1.buttonWasPressed();
        scelta1.buttonWasPressed();
        scelta2.buttonWasPressed();
        scelta2.buttonWasPressed();
        scelta1.buttonWasPressed();
        scelta2.buttonWasPressed();
    }
}
