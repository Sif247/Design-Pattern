package Warm_up;

public class Italian extends Person
{


    public Italian(String name, int age)
    {
        super(name, age);
    }

    public Italian(String name)
    {
        super(name);
    }

    void parla()
    {
        System.out.println("Ciao gente! ");
    }

    @Override
    public void say()
    {
        parla();
    }
}
