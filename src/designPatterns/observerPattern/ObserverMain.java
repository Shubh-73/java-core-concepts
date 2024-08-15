package designPatterns.observerPattern;

public class ObserverMain {

    public static void main(String[] args) {

         CricketScoreData cricketScores = new CricketScoreData();
         CricketScoreDisplay observer1 = new CricketScoreDisplay();
         CricketScoreDisplay observer2 = new CricketScoreDisplay();

         cricketScores.registerOberver(observer1);
         cricketScores.registerOberver(observer2);

         Thread t1 = new Thread(() -> {
             System.out.println("scores of India vs Australia");
             cricketScores.setScore(100, 2, 23.2);
         }, "thread t1");

         Thread t2 = new Thread(() -> {
             System.out.println("Scores of Pakistan vs England");
             cricketScores.setScore(130, 4, 23.2);
         }, "thread t2");


         t1.start();
         t2.start();


         try {
             t1.join();
             t2.join();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
    }
}
