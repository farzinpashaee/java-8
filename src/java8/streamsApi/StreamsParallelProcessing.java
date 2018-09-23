package java8.streamsApi;

import java.util.Arrays;
import java.util.List;

public class StreamsParallelProcessing {

    public static void main(String[] args) {

        List<String> list = Arrays.asList( "item1" , "" , "item3" , "item4" , "item5" , "item6" , "" );
        // Get count of empty string
        long emptyCount = list.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println( "Empty items count : " + emptyCount );

    }

}
