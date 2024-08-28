package StreamApiQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceQues {

//    public static int sumOfAll(List<Integer> nums){
//        return nums.stream().reduce(0, (a,b) -> a + b);
//    }

    public static int sumOfNums(List<Integer> nums){
        return nums.stream().reduce(0,Integer::sum);
    }

    public static int productOfNums(List<Integer> nums){
        Optional<Integer> prod = nums.stream().reduce((a, b) -> a * b);
        return prod.orElse(0);
    }

    public static String concatenatedString(List<String> words){

        return words.stream().collect(Collectors.joining(", "));
    }

    public static List<Integer> oddPartition(List<Integer> nums){
        return nums.stream().filter(num -> num % 2 == 1).collect(Collectors.toList());
    }


    public static void main(String[] args) {

        List<String> words = Arrays.asList("Kohli", "Rohit", "Surya", "Hardik", "Bumrah");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println("sum of numbers is: " + ReduceQues.sumOfNums(numbers));
        System.out.println("product of numbers is: " + ReduceQues.productOfNums(numbers));
        System.out.println("Concatenated Strings are: " + ReduceQues.concatenatedString(words));

        Map<Boolean, List<Integer>> partitioned = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> oddIntegers = partitioned.get(false);
        List<Integer> evenIntegers = partitioned.get(true);

        System.out.println("Odd integers are: " + oddIntegers);
        System.out.println("Even integers are: " + evenIntegers);
        List<Integer> nums = Arrays.asList(1,1,2,3,4,2,4,3,5,5,6,7,8,9,6);
        System.out.println("Unique numbers are : " + nums.stream().collect(Collectors.toSet()));
    }

}
