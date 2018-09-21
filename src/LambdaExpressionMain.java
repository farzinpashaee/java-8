public class LambdaExpressionMain {

    public static void main(String[] args){

        String hello = "Hello";

        MathOperation add = ( a , b) -> a + b ;
        System.out.println(" > " + add.operation(2,3));

        Greeting greeting = name -> {
            System.out.println(hello + " " + name);
            System.out.println("How are you?");
        } ;

        greeting.sayHello("Farzin");

    }

    public interface MathOperation{
        int operation( int a , int b );
    }

    public interface Greeting{
        void sayHello( String name );
    }

}
