package java8.referenceMethod;

import java.util.ArrayList;
import java.util.List;

public class PrintlnSample {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("item1");
        list.add("item2");
        list.add("item3");
        list.forEach(System.out::println);

    }
}
