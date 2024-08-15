package designPatterns.observerPattern;

public class ObserverMain {

    public static void main(String[] args) {

        CricketScoreData cricketData = new CricketScoreData();
        CricketScoreDisplay cricketDisplay = new CricketScoreDisplay();
        cricketData.registerOberver(cricketDisplay);
        System.out.println("new observer added");
        cricketData.setScore(200, 5, 31.5);
        System.out.println("scores update");
    }
}
