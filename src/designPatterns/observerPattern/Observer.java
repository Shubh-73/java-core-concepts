package designPatterns.observerPattern;

import java.util.Observable;

public interface Observer {

    public void update(int runs, int wickets, double overs);
}
