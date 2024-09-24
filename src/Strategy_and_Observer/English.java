package Strategy_and_Observer;

import java.util.ArrayList;
import java.util.List;

public class English extends Person
{

    public English(String name, int age) {
        super(name, age);
    }

    public English(String name) {
        super(name);
    }

    void speak()
    {
        System.out.println("Hello Word! ");
    }

    @Override
    public void say()
    {
        speak();
    }
}
