package StreamApiQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamPracticeQuestions {

    public static void main(String[] args) {

        /**

         given two objects -> trader and transaction, we need to performs operations given
         below using stream api

         1. Find all the transactions that took place in 2011 and sort them in low to high order
         2. Get all the unique cities where trader work
         3. Find all the Traders from Kolkata and sort them by name
         4. Return string of all traders sorted alphabetically
         5. Find if any trader is based in Mumbai
         6. Print all the transaction values from the traders living in Kolkata
         7. Find out the highest value of all the transactions
         8. Find the transaction with the smallest value
         */

        //creating a collection of Transaction type our stream function does not throw compile time error
        List<Transaction> transactions = new ArrayList<>();

        //solution to the first problem
        List<Transaction> transactionsIn2011 = transactions.stream().filter(t -> t.getYear() == 2011)
                .sorted(comparing(Transaction::getYear)).collect(toList());

        //stream the values -> filter on the basis of condition -> sort using field -> collect


        //second question
        //unique cities -> stream all transaction -> get all cities -> distint()

        List<String> uniqueCityNames = transactions.stream().
                map(t -> t.getTrader().getCity()).distinct().collect(toList());


        //third question
        //Find all the traders from Kolkata
        List<Trader> tradersFromKolkata = transactions.stream().map(t  -> t.getTrader())
                .filter(trader -> trader.getCity().equals("Kolkata"))
                .sorted(comparing(Trader::getName)).collect(toList());

        //fourth question
        //return string of all traders sorted alphabetically
        String traderNames = transactions.stream().map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (name1 , name2) -> name1 + name2);

        //fifth question
        //find if there is any trader in Mumbai

        Boolean mumbaiBasedTrader = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Mumbai"));


        //sixth question
        //find the transaction value from Kolkata traders
        Optional<Long> tradeValueFromKolkata = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Kolkata"))
                .map(Transaction::getValue)
                .map(Long::valueOf)
                .reduce(Long::sum);

    }
}
