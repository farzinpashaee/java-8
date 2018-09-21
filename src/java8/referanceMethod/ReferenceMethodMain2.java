package java8.referanceMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReferenceMethodMain2 {

    public static void main(String args[]) {
        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final MyComparator myComparator = new MyComparator();
        // Method reference
        Collections.sort(list, myComparator::compare);
        // Lambda expression
        Collections.sort(list, (a,b) -> myComparator.compare(a,b));
    }
    private static class MyComparator {
        public int compare(final Integer a, final Integer b) {
            return a.compareTo(b);
        }
    }

}
