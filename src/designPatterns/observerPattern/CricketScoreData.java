package designPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class CricketScoreData implements Subject{

    private List<Observer> observers ;
    private int runs;
    private int wickets;
    private double overs;

    public CricketScoreData() {
        observers = new ArrayList<>();
    }



    @Override
    public void registerOberver(Observer observer){
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(runs, wickets, overs);
        }
    }

    public void setScore(int runs, int wickets, double overs){
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        scoreChanged();
    }

    private void scoreChanged(){
        notifyObservers();
    }




}
