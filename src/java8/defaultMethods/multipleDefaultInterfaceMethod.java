package java8.defaultMethods;

public class multipleDefaultInterfaceMethod {

    public static void main(String[] args) {

        defaultInterfaceMethod.Developer developer = new defaultInterfaceMethod.Developer();
        developer.getDetails();

    }

    public interface Employee {
        default void getDetails() {
            System.out.println("Employee Details");
        }
    }

    public interface Citizen {
        default void getDetails() {
            System.out.println("Citizen Details");
        }
    }

    public static class Developer implements Employee, Citizen {
        public void getDetails() {
            System.out.println("Employee and Citizen Details");
        }
    }

}
