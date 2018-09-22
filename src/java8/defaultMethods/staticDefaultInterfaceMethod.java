package java8.defaultMethods;

public class staticDefaultInterfaceMethod {

    public static void main(String[] args) {

        Employee.getDetails();

    }

    public interface Employee {
        static void getDetails() {
            System.out.println("Employee Static Details");
        }
    }


}
