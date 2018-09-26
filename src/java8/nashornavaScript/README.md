# Nashorn JavaScript
With Java 8, Nashorn, a much improved javascript engine is introduced, to replace the existing Rhino. Nashorn provides 2 to 10 times better performance, as it directly compiles the code in memory and passes the bytecode to JVM. Nashorn uses invoke dynamics feature, introduced in Java 7 to improve performance.

## Example
#### Calling JavaScript from Java
Using ScriptEngineManager, JavaScript code can be called and interpreted in Java.
```
ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

String name = "Farzin";
Integer result = null;

try {
    nashorn.eval("print('" + name + "')");
    result = (Integer) nashorn.eval("20 + 8");
} catch(ScriptException e) {
    System.out.println("Error executing script: "+ e.getMessage());
}
System.out.println(result.toString());
```

#### Calling Java from JavaScript
The following example explains how to import and use Java classes in java script.
```
var BigDecimal = Java.type('java.math.BigDecimal');

function calculate(amount, percentage) {

   var result = new BigDecimal(amount).multiply(new BigDecimal(percentage)).divide(
      new BigDecimal("100"), 2, BigDecimal.ROUND_HALF_EVEN);
   
   return result.toPlainString();
}
var result = calculate(568000000000000000023,13.9);
print(result);
```
Open the console and use the following command.
```
C:\JAVA>jjs sample.js
```

