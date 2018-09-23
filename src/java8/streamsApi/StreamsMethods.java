package java8.streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsMethods {

    public static void main(String[] args) {

        // Generating 10 random number using forEach method and limit
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        // Using map method
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // Get list of squares
        List<Integer> squaresList = numbers.stream().map( i -> i*i).collect(Collectors.toList());
        System.out.println("squaresList: " + squaresList);

        // Get list of unique items
        List<Integer> uniqueList = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("uniqueList: " + uniqueList);

        // Generating 10 random number sorted
        random.ints().limit(10).sorted().forEach(System.out::println);


    }

}
