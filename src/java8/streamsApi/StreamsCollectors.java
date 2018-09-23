package java8.streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsCollectors {

    public static void main(String[] args) {

        // Collect as list
        List<String> list = Arrays.asList( "item1" , "" , "item3" , "item4" , "item5" , "item6" , "" );
        List<String> result = list.stream().filter(item -> !item.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + result);

        // Collect as comma delimited
        String commaDelimited = list.stream().filter(item -> !item.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Comma delimited String: " + commaDelimited);

    }

}
