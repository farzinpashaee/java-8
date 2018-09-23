package java8.streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeneratingStreams {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "", "b", "", "d","e");
        List<String> result = list.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("filtered result: " + result);

    }
}
