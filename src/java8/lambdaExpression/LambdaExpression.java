package java8.lambdaExpression;

public class LambdaExpression {

    public static void main(String[] args){

        // Multiple parameters with single line expression
        MathOperation add = ( a , b ) -> a + b ;
        System.out.println(add.operation( 2 , 3 ));

        // Single parameter (no parentheses) with multiple line expression {}
        Greeting greeting = name -> {
            System.out.println( "Hello " + name );
            System.out.println( "How are you? " );
        } ;

        greeting.sayHello("Farzin");

    }

    // Function interface for math operation
    public interface MathOperation{
        int operation( int a , int b );
    }

    // Function interface for greeting
    public interface Greeting{
        void sayHello( String name );
    }

}
