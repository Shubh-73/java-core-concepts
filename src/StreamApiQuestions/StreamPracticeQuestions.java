package StreamApiQuestions;

import java.util.ArrayList;
import java.util.List;

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



    }
}
