```groovy
class MyClass {
    def myMethod(String input) {
        if (input == null) {
            return "Null input"
        } else if (input.length() == 0) {
            return "Empty input"
        }
        return "Input: "+input
    }
}

MyClass myObj = new MyClass()
println myObj.myMethod(null) // Output: Null input
println myObj.myMethod("") //Output: Empty input
println myObj.myMethod("Hello") // Output: Input: Hello
```