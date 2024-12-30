```groovy
class MyClass {
    def myMethod(String input) {
        if (input == null || input.isEmpty()) {
            return "Null or Empty Input"
        }
        return "Input: "+input
    }
}

MyClass myObj = new MyClass()
println myObj.myMethod(null) // Output: Null or Empty Input
println myObj.myMethod("") //Output: Null or Empty Input
println myObj.myMethod("Hello") // Output: Input: Hello
```