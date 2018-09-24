package java8.optionalClass;

import java.util.Optional;

public class OptionalArgument {

    public static void main(String[] args) {

        String name = "Farzin";
        Optional<String> o = Optional.of(name);
        sayHello(o);

        String name2 = null;
        Optional<String> o2 = Optional.ofNullable(name2);
        sayHello(o2);

    }

    public static void sayHello( Optional<String> name ){
        System.out.println("Hello " + name.orElse("No Name"));
    }

}
