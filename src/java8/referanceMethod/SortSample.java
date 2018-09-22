package java8.referanceMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortSample {

    public static void main(String args[]) {

        final List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80);
        final SampleComparator sampleComparator = new SampleComparator();
        // Method reference
        Collections.sort(list, sampleComparator::compare);
        // Equal lambda expression
        Collections.sort(list, (a,b) -> sampleComparator.compare(a,b));

    }
    private static class SampleComparator {
        public int compare(final Integer a, final Integer b) {
            return a.compareTo(b);
        }
    }

}
