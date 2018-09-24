#Lambda Expression in Java 8
Java lambda expressions are Java's first step into functional programming. A Java lambda expression is thus a function 
which can be created without belonging to any class. Java lambda expressions are commonly used to implement simple event 
listeners / callbacks, or in functional programming with the Java Streams API.

## Example
We have a function interface ( an interface with single abstract method) which we will use
to implement our function as an implementation.
```
public interface MathOperation{
    int operation( int a , int b );
}
```
Using parameter -> expression syntax we will implement function interface as fallow:
- **Optional type declaration:** No need to declare the type of a parameter. The compiler can inference the same from the value of the parameter.
- **Optional parenthesis around parameter:** No need to declare a single parameter in parenthesis. For multiple parameters, parentheses are required.
- **Optional curly braces:** No need to use curly braces in expression body if the body contains a single statement.
- **Optional return keyword:** The compiler automatically returns the value if the body has a single expression to return the value. Curly braces are required to indicate that expression returns a value.
```
MathOperation add = ( a , b ) -> a + b ;
```
And finally we can use the function like this:
```
System.out.println(add.operation( 2 , 3 ));
```
