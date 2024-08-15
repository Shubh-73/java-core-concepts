package designPatterns.observerPattern;

public interface Subject {

    void registerOberver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
