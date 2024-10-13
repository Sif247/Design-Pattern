package Observer;

public class Test {

    public static void main(String[] args) {


        Professor p1 = new Professor("Francesco Rossi");
        Professor p2 = new Professor("Paolo Bianchi");


        StudentPull s1 = new StudentPull("Ismail");
        StudentPull s2 = new StudentPull("Sifdine");

        s1.setProfessor(p1);
        s2.setProfessor(p2);


        p1.uploadContent("IS-DesignPattern_2_DecoratorFactory.pdf");
        p2.uploadContent("ListeEPuntatori.pdf");


        p1.uploadContent("IS-DesignPattern_1_StrategyObserver.pdf");
    }
}
