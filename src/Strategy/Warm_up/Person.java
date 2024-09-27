package Strategy.Warm_up;

import java.util.ArrayList;

public class Person {
    public String name;
    public int age;
    public ArrayList<String> friends = new ArrayList<String>();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public ArrayList<String> getFriends()
    {
        return friends;
    }

    public void setFriends(ArrayList<String> friends)
    {
        this.friends = friends;
    }



    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Person(String name)
    {
        this.name = name;
    }



    void say(){};
}
