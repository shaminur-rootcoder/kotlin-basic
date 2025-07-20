package com.example.kotlinbasic

fun main(){
//    learnVariable()
//    learnDataType()
//    learnString()
//    learnBoolean()
//    learnOperator(10,20)
//    learnConditional(10,20)
//    learnLoop()
//    learnFunction()
//    learnArray()
//    learnList()
//    learnMap()
//    learnClass()
//    learnLambda()
    learnCallBack()

}

fun learnVariable(){
    ///////////////1.Variables///////////
    println("----1.Learning Variables Declaration- var vs val----")

    // var -> work as variable and can be changed.
    var name = "John"
    println(name)
    name = "Doe"
    println(name+"\n")
    // val -> work as constant and cannot be changed. read only
    val pi = 3.14
    println(pi*3)

    println("\n\n\n")
}

fun learnDataType(){
    ///////////////2.Data type///////////
    // Declear variables and assign values
    println("----2.Learning Variables types-int,double,string,boolean----")
    val myNum: Int = 5                // Int
    val myDoubleNum: Double = 5.99    // Double
    val myLetter: Char = 'D'          // Char
    val myBoolean: Boolean = true     // Boolean
    val myText: String = "Hello"      // String

    println(myNum)
    println(myDoubleNum)
    println(myLetter)
    println(myBoolean)
    println(myText+"\n")

    //Integer types
    println("===Integer types-Byte,Short,Int,Long\n===")
    val myNum0: Byte = 100
    println(myNum0)
    val myNum1: Short = 5000
    println(myNum1)
    val myNum2: Int = 100000
    println(myNum2.toString() + "\n")
    //Floating  types
    println("===Float types-Float,Double\n===")
    val myNumF: Float = 5.75F
    println(myNumF)
    val myDoubleNumD: Double = 5.99
    println(myDoubleNumD)
    println("\n\n\n")

}

fun learnString(){
    ///////////////3.String///////////
    println("----3.Learning String----")
    var greeting: String = "Hello"
    println(greeting+"\n")

    //Access a String
    println("===Access a String===")
    var txt = "Hello World"
    println(txt[0]) // first element (H)
    println(txt[2]) // third element (l)
    println("\n")

    //String Length
    println("===String Length===")
    var txtLength = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txt string is: " + txtLength.length)
    println("\n")

    //String Functions
    println("===String Functions===")
    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)
    println("\n")

    //Finding a String in a String
    println("===Finding a String in a String===")
    var txt3 = "Please locate where 'locate' occurs!"
    println(txt3.indexOf("locate"))  // Outputs 7
    println("\n")

    //String Concatenation
    println("===String Concatenation===")
    var firstName = "John"
    var lastName = "Doe"
    println(firstName + " " + lastName)
    println("\n")

    //String Templates/Interpolation
    println("===String Templates/Interpolation===")
    var firstName1 = "John"
    var lastName2 = "Doe"
    println("My name is $firstName1 $lastName2")
    println("\n")
    println("\n\n\n")

}

fun learnBoolean() {
    ///////////////4.Boolean///////////
    println("----4.Learning Boolean----")
    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false
    println(isKotlinFun)   // Outputs true
    println(isFishTasty)   // Outputs false
    println("\n\n\n")
}

fun learnOperator(a: Int, b: Int) {
    println("----5.Learning Operators----")
    println("=== Arithmetic Operators ===")
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")

    println("\n=== Assignment Operators ===")
    var x = a
    x += b
    println("x += b => $x")
    x -= b
    println("x -= b => $x")
    x *= b
    println("x *= b => $x")
    x /= b
    println("x /= b => $x")
    x %= b
    println("x %= b => $x")

    println("\n=== Comparison Operators ===")
    println("a == b: ${a == b}")
    println("a != b: ${a != b}")
    println("a > b: ${a > b}")
    println("a < b: ${a < b}")
    println("a >= b: ${a >= b}")
    println("a <= b: ${a <= b}")

    println("\n=== Logical Operators ===")
    val boolA = true
    val boolB = false
    println("boolA && boolB: ${boolA && boolB}")
    println("boolA || boolB: ${boolA || boolB}")
    println("!boolA: ${!boolA}")

    println("\n=== Unary Operators ===")
    var y = -a
    println("-a = $y")
    y = +a
    println("+a = $y")
    y++
    println("y++ = $y")
    y--
    println("y-- = $y")

    println("\n=== Bitwise Operators ===")
    println("a and b: ${a and b}")
    println("a or b: ${a or b}")
    println("a xor b: ${a xor b}")
    println("a shl 1: ${a shl 1}")  // shift left
    println("a shr 1: ${a shr 1}")  // shift right
    println("a.inv(): ${a.inv()}")  // bitwise NOT

    println("\n=== Range Operators ===")
    println("a in 1..10: ${a in 1..10}")
    println("b !in 1..5: ${b !in 1..5}")
    println("for (i in 1..5):")
    for (i in 1..5) {
        print("$i ")
    }

    println("\n\n=== Collection Operators ===")
    val list = listOf(1, 2, 3, 4, 5)
    println("a in list: ${a in list}")
    println("b !in list: ${b !in list}")
    println("\n\n\n")
}

fun learnConditional(a: Int, b: Int) {
    println("----6.Learning Conditional if-else----")
    println("=== if Statement ===")
    if (a > b) {
        println("a is greater than b")
    }

    println("\n=== if-else Statement ===")
    if (a == b) {
        println("a is equal to b")
    } else {
        println("a is not equal to b")
    }

    println("\n=== else-if Ladder ===")
    if (a > b) {
        println("a is greater")
    } else if (a < b) {
        println("b is greater")
    } else {
        println("a and b are equal")
    }

    println("\n=== Kotlin Expression 'if' (Ternary-style) ===")
    val max = if (a > b) a else b
    println("Max of a and b is: $max")

    println("\n=== when Statement ===")
    val grade = 85
    when {
        grade >= 90 -> println("Excellent")
        grade in 80..89 -> println("Very Good")
        grade in 70..79 -> println("Good")
        else -> println("Needs Improvement")
    }

    println("\n=== when with value ===")
    val day = 3
    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println("Day $day is $dayName")
    println("\n\n\n")
}

fun learnLoop() {
    println("----7.Learning Loop for,while,do-while----")
    println("=== for Loop (Range) ===")
    for (i in 1..5) {
        print("$i ") // 1 2 3 4 5
    }
    println()

    println("\n=== for Loop with Step ===")
    for (i in 1..10 step 2) {
        print("$i ") // 1 3 5 7 9
    }
    println()

    println("\n=== for Loop in Reverse ===")
    for (i in 5 downTo 1) {
        print("$i ") // 5 4 3 2 1
    }
    println()

    println("\n=== for Loop over Array/List ===")
    val fruits = listOf("Apple", "Banana", "Cherry")
    for (fruit in fruits) {
        println("Fruit: $fruit")
    }

    println("\n=== forEach Loop ===")
    fruits.forEach {
        println("Fruit in forEach: $it")
    }

    println("\n=== forEachIndexed Loop ===")
    fruits.forEachIndexed { index, value ->
        println("Fruit at $index: $value")
    }

    println("\n=== while Loop ===")
    var x = 1
    while (x <= 5) {
        print("$x ") // 1 2 3 4 5
        x++
    }
    println()

    println("\n=== do-while Loop ===")
    var y = 1
    do {
        print("$y ") // 1 2 3 4 5
        y++
    } while (y <= 5)
    println()

    println("\n=== Nested Loops ===")
    for (i in 1..3) {
        for (j in 1..2) {
            println("i=$i, j=$j")
        }
    }

    println("\n=== Break and Continue ===")
    for (i in 1..5) {
        if (i == 3) {
            println("Skipping 3")
            continue
        }
        if (i == 5) {
            println("Breaking at 5")
            break
        }
        println("i = $i")
    }

    println("\n\n\n")
}

fun learnFunction() {
    println("----8.Learning function----")
    println("\n=== Basic Function ===")
    fun greet(name: String): String {
        return "Hello, $name!"
    }
    println(greet("Alice"))

    println("\n=== Default Arguments ===")
    fun greetDefault(name: String = "Guest"): String {
        return "Hello, $name!"
    }
    println(greetDefault())
    println(greetDefault("Bob"))

    println("\n=== Named Arguments ===")
    fun formatName(firstName: String, lastName: String): String {
        return "$lastName, $firstName"
    }
    println(formatName(lastName = "Smith", firstName = "John"))

    println("\n=== Unit Function ===")
    fun showMessage(message: String) {
        println("Message: $message")
    }
    showMessage("Welcome!")

    println("\n=== Single-Expression Function ===")
    fun square(x: Int) = x * x
    println("Square of 4: ${square(4)}")

    println("\n=== Recursive Function ===")
    fun factorial(n: Int): Int {
        return if (n <= 1) 1 else n * factorial(n - 1)
    }
    println("Factorial of 5: ${factorial(5)}")

    println("\n=== Higher-Order Function ===")
    fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
    println("Sum using lambda: ${operate(4, 3) { x, y -> x + y }}")

    println("\n=== Lambda Function ===")
    val multiply: (Int, Int) -> Int = { a, b -> a * b }
    println("Multiply 3 * 4: ${multiply(3, 4)}")

    println("\n=== Extension Function ===")
    fun String.reverse(): String = this.reversed()
    println("Kotlin".reverse())

    println("\n=== Local Function ===")
    fun outer() {
        fun inner() {
            println("Inside local function!")
        }
        inner()
    }
    outer()

    println("\n=== Tail Recursive Function ===")
    tailrec fun sum(n: Int, acc: Int = 0): Int {
        return if (n == 0) acc else sum(n - 1, acc + n)
    }
    println("Sum from 5 to 0: ${sum(5)}")

    println("\n=== Anonymous Function ===")
    val divide = fun(a: Int, b: Int): Int {
        return a / b
    }
    println("Divide 10 / 2: ${divide(10, 2)}")

    println("\n=== Generic Function ===")
    fun <T> echo(value: T): T = value
    println("Echo Int: ${echo(123)}")
    println("Echo String: ${echo("Hello")}")

    println("\n=== Vararg Function ===")
    fun printAll(vararg messages: String) {
        for (msg in messages) println(msg)
    }
    printAll("One", "Two", "Three")
    println("\n\n\n")
}

fun learnArray() {
    println("----9.Learning array----")
    println("\n=== Basic Array using arrayOf() ===")
    var array = arrayOf(1, 2, 3, 4, 5);
    println(array[0])
    println(array[1])
    println(array[2])
    println(array[3])
    println(array[4])

    println("\n=== Primitive Arrays (IntArray, DoubleArray, etc.) ===")
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    for (num in numbers) {
        println(num)
    }

    println("\n=== Access and Modify Array Elements ===")
    val colors = arrayOf("Red", "Green", "Blue")
    println("Original: ${colors.joinToString()}")
    colors[1] = "Yellow"
    println("Modified: ${colors.joinToString()}")

    println("\n=== Array Functions Examples ===")
    val nums = arrayOf(10, 20, 30, 40)
    println("Sum: ${nums.sum()}")
    println("Max: ${nums.maxOrNull()}")
    println("Contains 20? ${nums.contains(20)}")

    println("\n=== multidimentaional array ===")
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    for (row in matrix) {
        println(row.joinToString());
    }

    println("\n=== Convert Between Array and List ===")
    val listFromArray = nums.toList()
    println("List from array: $listFromArray")
    println("\n\n\n")
}

fun learnList(){
    println("----10.Learning list----")
    println("\n=== Immutable List (read-only) ===")
    val immutableList = listOf("Apple", "Banana", "Cherry")
    println("Immutable List: $immutableList")
    // immutableList.add("Date")  // Error! Can't modify

    println("\n=== Mutable List ===")
    val mutableList = mutableListOf("Cat", "Dog", "Elephant")
    println("Mutable List before: $mutableList")
    mutableList.add("Fox")
    mutableList.remove("Dog")
    println("Mutable List after: $mutableList")

    println("\n=== ArrayList ===")
    val arrayList = arrayListOf(1, 2, 3)
    println("ArrayList before: $arrayList")
    arrayList.add(4)
    println("ArrayList after: $arrayList")

    println("\n=== List with Explicit Type ===")
    val stringList: List<String> = listOf("Red", "Green", "Blue")
    println("Explicit type List: $stringList")

    println("\n=== List with Heterogeneous Types (using Any) ===")
    val mixedList: List<Any> = listOf("Kotlin", 123, true, 45.6)
    println("Mixed List: $mixedList")

    println("\n=== Empty List ===")
    val emptyList = emptyList<String>()
    println("Empty List size: ${emptyList.size}")

    println("\n=== List with Null Values ===")
    val nullableList: List<String?> = listOf("A", null, "C")
    println("Nullable List: $nullableList")

    println("\n=== Creating List from Array ===")
    val array = arrayOf("One", "Two", "Three")
    val listFromArray = array.toList()
    println("List from Array: $listFromArray")

    println("\n=== List Operation ===")
    val fruits = mutableListOf("Apple", "Banana", "Cherry")
    println("Original list: $fruits")

    // Add elements
    fruits.add("Date")               // Add at the end
    fruits.add(1, "Blueberry")       // Add at index 1
    println("After adding: $fruits")

    // Remove elements
    fruits.remove("Banana")          // Remove by value
    fruits.removeAt(2)               // Remove by index
    println("After removing: $fruits")

    // Replace elements
    fruits[0] = "Apricot"            // Replace element at index 0
    println("After replacing: $fruits")
    println("\n\n\n")


    println("\n=== Set (Unique Elements) ===")
    // Immutable set (read-only)
    val immutableSet = setOf("Apple", "Banana", "Cherry", "Apple")  // Duplicate "Apple" ignored
    println("Immutable Set: $immutableSet")

    // Mutable set
    val mutableSet = mutableSetOf("Cat", "Dog", "Elephant")
    println("Mutable Set before: $mutableSet")
    mutableSet.add("Fox")
    mutableSet.remove("Dog")
    println("Mutable Set after: $mutableSet")
    println("\n\n\n")

}

fun learnMap() {
    println("----11.Learning Map or dictionary----")
    println("\n=== Immutable Map ===")
    val immutableMap = mapOf(
        1 to "One",
        2 to "Two",
        3 to "Three"
    )
    println("Immutable Map: $immutableMap")
    println("Access key 2: ${immutableMap[2]}")

    println("\n=== Mutable Map ===")
    val mutableMap = mutableMapOf(
        "A" to 100,
        "B" to 200
    )
    println("Mutable Map before: $mutableMap")
    mutableMap["C"] = 300       // Add new entry
    mutableMap["A"] = 150       // Update value
    mutableMap.remove("B")      // Remove entry
    println("Mutable Map after: $mutableMap")

    println("\n=== LinkedHashMap (Preserves Insertion Order) ===")
    val linkedMap = linkedMapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3
    )
    println("LinkedHashMap: $linkedMap")

    println("\n=== SortedMap (Sorted by Keys) ===")
    val sortedMap = sortedMapOf(
        3 to "Three",
        1 to "One",
        2 to "Two"
    )
    println("SortedMap: $sortedMap")  // Keys sorted ascending

    println("\n=== Accessing Map Elements ===")
    for ((key, value) in mutableMap) {
        println("$key -> $value")
    }

    println("\n=== 6. Map Functions ===")
    println("Keys: ${immutableMap.keys}")
    println("Values: ${immutableMap.values}")
    println("Contains key 1? ${immutableMap.containsKey(1)}")
    println("Contains value 'Two'? ${immutableMap.containsValue("Two")}")
}

fun learnClass(){
    println("----12.Learning Class----")
    println("\n=== Create an Object ===")
    val person = Person()
    person.name = "John"
    person.age = 25
    person.speak()

    println("\n=== Constructor to Initialize Properties ===")
    val animal = Animal("Buddy", "Dog")
    animal.describe()

    println("\n=== init Block (Runs During Object Creation) ===")
    val s1 = Student("John", 8)

    println("\n=== Inheritance ===")
    val dog = Dog()
    dog.eat()  // Inherited from Animal
    dog.bark()

    println("\n=== data class ===")
    //A data class in Kotlin is used to hold data only
    val book1 = Book("Atomic Habits", "James Clear", 2018)
    val book2 = Book("Atomic Habits", "James Clear", 2018)

    // Print book info
    println("Book 1: $book1")



}

fun learnLambda(){
    println("----13.Learning Lambda----")
    //lamda syntex
//    val lambdaName: (InputType) -> ReturnType = { parameterName: InputType ->
//        // body
//    }

    println("===Lambda with no parameters===")
    val greet = { println("Hello!") }
    greet()
    println("\n")


    println("===Lambda with one parameters===")
    val square = { it: Int -> it * it }
    println(square(6))
    //val square: (Int) -> Int = { it * it }


    println("===Lambda with two parameters===")
    // Define a lambda that adds two numbers
    val add: (Int, Int) -> Int = { a, b -> a + b }
    // Call the lambda
    val result = add(5, 3)
    println("The sum is: $result")

    var multiply: (Int,Int) -> Int = {a,b  -> a*b}
    val mulResult = multiply(5,3);
    println("The multiply is: $mulResult")
    println("\n")


    println("===Lambda with no return ===")
    val multiNoReturn: (Int) -> Unit = {println("the value is :"+ it * it)}
    multiNoReturn(5)
}

fun learnCallBack(){
    println("----14.Learning CallBack----")

    println(" === Simple Call Back with no argument ===")
    fun doSomething(arg: ()-> Unit){
        println("This is before call back")
        arg()
    }

    doSomething{
        println("This is call back")
    }

    println(" === Simple Call Back with  argument ===")

    fun doSum(c: Int, d: String,sum: (Int,Int) -> Int,){
        println("This is before call back")
        val result = sum(c,d.toInt())
        println("The sum is: $result")
        sum(10,20)
    }

    doSum(10,"5"){
          a, b -> a + b
    }

}









