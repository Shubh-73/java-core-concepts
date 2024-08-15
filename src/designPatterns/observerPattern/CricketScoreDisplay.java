package designPatterns.observerPattern;

public class CricketScoreDisplay implements Observer{

    private int runs;
    private int wickets;
    private double overs;


    @Override
    public void update(int runs, int wickets, double overs){
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    public void display(){
        System.out.println("Cricket score : " + runs + "/" + wickets + " " + overs + "overs");

    }
}
