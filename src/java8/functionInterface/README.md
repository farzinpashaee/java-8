# Function Interface
Function interface is an interface with single functionality and single abstract method. 
A well known example would be **Comparable** interface with a single method ‘compareTo’ method.

## Example
Using **Predicate** function interface and [Lambda expression](https://github.com/farzinpashaee/java-8/tree/master/src/java8/lambdaExpression) a list of integer can be 
iterated and printed.
```
System.out.println("Print even numbers:");
print(list, n-> n%2 == 0 );
 ...
public static void print(List<Integer> list, Predicate<Integer> predicate) {
    for(Integer n: list) {
        if(predicate.test(n)) {
            System.out.println(n);
        }
    }
}
```