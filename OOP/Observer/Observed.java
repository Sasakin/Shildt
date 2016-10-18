package Observer;

public interface Observed {
    public void addObserver(Observer observer);

    public void removedObserver(Observer observer);

    public void notifyObservers();
}
