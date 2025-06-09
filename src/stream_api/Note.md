Lambda Expression: This is an anonymous functions (methods without names) that can be passed around as values.

# **Lambda Expressions in Java (Complete Guide)**

Lambda expressions, introduced in **Java 8**, revolutionized how we write code by enabling **functional programming** in Java. They provide a concise way to represent **anonymous functions** (methods without names) that can be passed around as values.

---

## **1. What is a Lambda Expression?**
A lambda expression is a **short block of code** that:
- Takes parameters
- Executes a function
- Returns a result (if needed)

### **Syntax:**
```java
(parameters) -> { expression_or_statements }
```
- If single parameter & no type declaration:  
  `param -> expression`
- If multiple parameters:  
  `(param1, param2) -> expression`
- If multiple statements:  
  `(params) -> { statements; return value; }`

---

## **2. Why Use Lambda Expressions?**
✅ **Concise code** (reduces boilerplate)  
✅ **Enables functional programming**  
✅ **Works with Streams API** (e.g., `filter`, `map`, `reduce`)  
✅ **Improves readability**  

---

## **3. Lambda vs. Anonymous Class**
### **Before Java 8 (Anonymous Class)**
```java
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello World");
    }
};
```

### **After Java 8 (Lambda)**
```java
Runnable r = () -> System.out.println("Hello World");
```
**Lambda is shorter and cleaner!**

---

## **4. Examples of Lambda Expressions**
### **Example 1: No Parameters**
```java
Runnable task = () -> System.out.println("Running task!");
task.run();
```
**Output:**  
```
Running task!
```

### **Example 2: Single Parameter**
```java
Consumer<String> print = (str) -> System.out.println(str);
print.accept("Hello Lambda!");
```
**Output:**  
```
Hello Lambda!
```

### **Example 3: Multiple Parameters**
```java
BinaryOperator<Integer> add = (a, b) -> a + b;
System.out.println(add.apply(5, 3)); // Output: 8
```

### **Example 4: With Return Statement**
```java
Function<Integer, String> evenOdd = (num) -> {
    if (num % 2 == 0) return "Even";
    else return "Odd";
};
System.out.println(evenOdd.apply(7)); // Output: Odd
```

---

## **5. Lambdas with Functional Interfaces**
Lambda expressions work with **Functional Interfaces** (interfaces with **one abstract method**).  
Examples:  
✔️ `Runnable` → `run()`  
✔️ `Consumer<T>` → `accept(T t)`  
✔️ `Supplier<T>` → `get()`  
✔️ `Function<T,R>` → `apply(T t)`  
✔️ `Predicate<T>` → `test(T t)`  

### **Example: Using `Predicate`**
```java
Predicate<Integer> isPositive = num -> num > 0;
System.out.println(isPositive.test(10)); // true
```

---

## **6. Lambdas in Collections (Stream API)**
Lambdas shine when used with Java **Streams**:
```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5);

// Filter even numbers
List<Integer> evens = numbers.stream()
    .filter(n -> n % 2 == 0)
    .toList(); // [2, 4]

// Square each number
List<Integer> squares = numbers.stream()
    .map(n -> n * n)
    .toList(); // [1, 4, 9, 16, 25]
```

---

## **7. Method References (Shortcut for Lambdas)**
If a lambda just calls an existing method, use **method references**:
```java
// Lambda
numbers.forEach(x -> System.out.println(x));

// Method Reference (shorter)
numbers.forEach(System.out::println);
```

---

## **8. When NOT to Use Lambdas**
❌ **Complex logic** (use regular methods)  
❌ **Multi-line statements** (if readability suffers)  
❌ **Need to modify variables** (lambdas require `final` or effectively final vars)  

---

## **9. Key Takeaways**
✔️ **Lambdas = Anonymous functions**  
✔️ **Work with Functional Interfaces**  
✔️ **Make code concise**  
✔️ **Best used with Streams API**  
✔️ **Method references = Shorter lambdas**  

---

### **Final Thought**
Lambdas make Java **more expressive** and **functional**. They are widely used in **modern Java development**, especially with **Streams, Collections, and Multithreading**.  

**Would you like a deeper dive into `Stream API` or `Functional Interfaces`?** 🚀