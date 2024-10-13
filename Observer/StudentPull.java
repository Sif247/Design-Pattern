package Observer;

public class StudentPull implements StateStudent {
    private String name;
    private Observable professor;

    public StudentPull(String name) {
        this.name = name;
    }

    public void setProfessor(Observable professor) {
        this.professor = professor;
        professor.registerObserver(this);
    }

    @Override
    public void update(Observable professor) {
        showNotification(professor);
    }

    public void showNotification(Observable professor) {
        if (professor instanceof Professor) {
            Professor p = (Professor) professor;
            System.out.println(name + ": Prof. " + p.getName() + " ha caricato " + p.getContent() + " su Dolly.");
        }
    }
}