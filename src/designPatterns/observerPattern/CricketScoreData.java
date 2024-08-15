package designPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class CricketScoreData implements Subject{

    private List<Observer> observers ;
    private int runs;
    private int wickets;
    private double overs;
    private final ReentrantLock lock = new ReentrantLock();

    public CricketScoreData() {

        observers = new ArrayList<>();
    }



    @Override
    public void registerOberver(Observer observer){
        lock.lock();
        try {
            observers.add(observer);
        } finally {
            lock.unlock();
        }
        //observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer){
        lock.lock();
        try {
            observers.remove(observer);
        } finally {
            lock.unlock();
        }
        //observers.remove(observer);
    }
    @Override
    public void notifyObservers(){
        lock.lock();
        try {
            for (Observer observer : observers) {
                observer.update(runs, wickets, overs);
            }
        } finally {
            lock.unlock();
        }
    }

    public void setScore(int runs, int wickets, double overs){
        lock.lock();
        try {
            this.runs = runs;
            this.wickets = wickets;
            this.overs = overs;
            scoreChanged();
        } finally {
            lock.unlock();
        }
    }

    private void scoreChanged(){
        notifyObservers();
    }




}
