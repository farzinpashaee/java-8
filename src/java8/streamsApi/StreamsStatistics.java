package java8.streamsApi;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamsStatistics {


    public static void main(String[] args) {

        List numbers = Arrays.asList(8,43,3,2,2,3,7,3,12,3,5);
        IntSummaryStatistics stats = numbers.stream().mapToInt( (x) -> (Integer) x ).summaryStatistics();

        System.out.println("Total Count: " + stats.getCount());
        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());

    }


}
