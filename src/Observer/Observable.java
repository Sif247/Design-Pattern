package Observer;

public interface Observable{
    public abstract void registerObserver(StateStudent o);
    public abstract void removeObserver(StateStudent o);
    public abstract void notifyObservers();
}
