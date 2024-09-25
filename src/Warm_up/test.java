package Warm_up;

public class test
{
    public static void main(String[] args)
    {
        English persona1 = new English("Franck");
        Italian persona2 = new Italian("Francesco", 29);

        persona2.friends.add("Franck");

        persona1.say();
        persona2.say();
        System.out.println(persona2.getFriends());
    }
}
