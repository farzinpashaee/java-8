package java8.defaultMethods;

public class defaultInterfaceMethod {

    public static void main(String[] args) {

        Developer developer = new Developer();
        developer.getDetails();

    }

    public interface Employee {
        default void getDetails() {
            System.out.println("Employee Details");
        }
    }

    public static class Developer implements Employee{

    }

}
