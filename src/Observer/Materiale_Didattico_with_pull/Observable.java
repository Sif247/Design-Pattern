package Observer.Materiale_Didattico_with_pull;

public interface Observable{
    public abstract void registerObserver(StateStudent o);
    public abstract void removeObserver(StateStudent o);
    public abstract void notifyObservers();
}
