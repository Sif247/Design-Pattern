package Observer.Materiale_Didattico_with_pull;

import java.util.ArrayList;

public class Professor implements Observable {
    String Name;
    ArrayList<StateStudent> observers;
    String content;

    public Professor(String name) {
        this.observers = new ArrayList<>();
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void registerObserver(StateStudent o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(StateStudent o) {
        observers.remove(o);
    }

    public void uploadContent(String content) {
        this.content = content;
        newContent();
    }

    public void newContent() {
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (StateStudent o : observers) {
            o.update(this);
        }
    }
}


