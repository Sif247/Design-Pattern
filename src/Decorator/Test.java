public class Test
{
    public static void main(String[] args)
    {
        Pc computer1 = new Monitor();
        computer1 = new HD(computer1);
        computer1 = new CPU(computer1);
        computer1 = new RAM(computer1);

        System.out.println("The components are: " + computer1.getDescription() + ". The price is: " + computer1.price());



    }

}
