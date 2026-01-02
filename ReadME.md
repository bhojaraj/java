# Installation
  Go to Oracle website - https://www.oracle.com/in/java/technologies/downloads/

  For mac with intel chip - go for x64 (DMG installer would be easy to install comparing to Compressed archive)

  For mac with M series chips - go for ARMx64

  Once installed, to confirm, run `java --version`

  should give the ouput as below, depending on the version installed
  
  ```
  java 25 2025-09-16 LTS
  Java(TM) SE Runtime Environment (build 25+37-LTS-3491)
  Java HotSpot(TM) 64-Bit Server VM (build 25+37-LTS-3491, mixed mode, sharing)
  ```

  To check the javac version, run  `javac --version`

# Overview - `Basics/Hello.java`
  JAVA is a platform independent language. 

  Installing JDK - JRE will be in JDK and JVM will be in JRE

  JVM is platform dependent but not JAVA

  To print something - System.out.print()

  To print in separate line - System.out.ptintln()

  To run java file, first compile by running the command `javac Basics/Hello.java`, or else can go to directory Basics in terminal and run `javac Hello.java`

  After compiling, run `java Basics/Hello` or from directory Basics folder `java Hello`

# Variables
  Similar to other programming languages - variables will be used for memory allocation for data processing

# DataTypes
  There are 2 Categories Primitive and 

  Primitive datatypes are simple and easy to use for data processing and they are inbuilt datatypes in java.
  In primitive datatypes, 
  * Integer - int, long, byte, short
  * Character - char
  * Float - float, double
  * Boolean - true, false


##### Integer
  byte by = 127; // size is 1 byte or 8 bits, range -2^7 to (2^7 - 1) or -128 to 127\
  short sh = 767; // size is 2 bytes or 16 bits, range is -2^15 to (2^15 - 1)\
  int i = 10; // 4 bytes or (2^31 - 1) bits, range is -2^31 to (2^31 - 1)\
  long l = 10L; // 8 bytes or (2^63 - 1) bits, range is -2^63 to (2^63 - 1), L is mandatory appendment L in the end

##### Float
  float num = 5.6f; // size is 4 bytes, f needs to added in order to say it is float value\
  double num = 5.6; // size is 8 bytes

##### Character
  char b = '&'; // 1 byte and should always be single quote \
  String name = "bharath"; // 2 bytes and should be double quotes

##### Boolean
  boolean b = true; \ only keyword, not 1
  boolean b = false;

# Type conversion

  regular conversion, int has more range, so no error \
  byte a = 33; \
  int b = a;

  these are explicit conversion since we need to mention the type that it needs to converted
  int a = 129; \
  byte b = a;\
  this would throw an error as int has more range but if it is written as below\
  byte b = (byte) a; \
  this will convert ^ \

  similarly with float, if float a = 3.8f; then converting to int b = (int) a; b would lose .8 in the conversion
  float f = 3.8; \
  int i = (int) f; // 3

##### Type promotion
  though it does not know the result value, it would not allow result to be byte when byte and byte getting multiplied
  byte a = 10;\
  byte b = 30;\
  int result = a * b;\
  System.out.print(result);

# Operators

##### Arithmetic Operators
  +, -, *, /, %, +=, ++, -=, -- \
  eg: num++ --> post-increment and ++num --> pre-increment

##### Relational Operators
  >, <, ==, !=, >=, <=

##### Logical Operators
  &&, ||, !

# Statements (Conditional Statements) - `Basics/Statements.java`

##### If else statement
##### If else if statement
##### Ternary operator / statement
##### Switch statement

# Loops - `Basics/Loops.java`
Needed for some repeated operations

##### While loop
##### Do While loop
##### For loop

refer examples for loops here java/Basics/Loops.java

# Main concepts - `Main`

## Classes - `Main/Demo.java`
Class is what you need to create objects. Class is a user-defined type that describes what an object looks like. Like structure and behavior of the object.

Class is what defines the object and in order to use any method in class, reference variable should be used and assigned with new copy of class and methods can be accessed.

## Methods
So in the code below, `main` is the method, like beginning of the execution of the class `Demo` 

and `add` is a method in the class Claculator. When add method needs to be called / accessed in Demo class, first it needs to be assigned to a reference variable as an object, then `add` method can be called

```
class Calculator {
  public int add() {
    return 2;
  }
}

public class Demo {
  public static void main(String[] args) {
  }
}
```

Method overloading
There can be multiple methods with same name but the different number of arguments it expects and different type of argument should be passed

for eg:
```
class Calculator {
  public int add() {
    return 2;
  }

  public int add(int n1, int n2) {
    return n1 + n2;
  }

  public int add(int n1, int n2, int n3) {
    return n1 + n2 + n3;
  }

  public double add (int n1, double n2) {
    return n1 + n2;
  }
}
```

## Stack and Heap
```
class Calculator {
  int num = 3;
  public int add(int n1, int n2) {
    return n1 + n2;
  }
}

public class {
  class static void main(String[] args) {
    Calculator obj = new Calculator();
    int newValue = obj.add(2, 3);
  }
}
```
Here 
n1, n2 are `local variables` for add method stack memory
but num is `instance variable` and will be in heap memory

Better visit this for stack and heap - https://youtu.be/_GK3WoFFKUE?si=vNiYZfc65VJoF10K

## Arrays
```
int numArray[] = {1, 2, 3, 4};
int[] emptyArray = {};
```
Multi-dimensional array
```
int multiNumArray[][] = {numArray, emptyArray};
```

```
int multiNumArray[][] = new int[3][4]; // array of 3 elements which are arrays of length 4
int jaggedMultiNumArray[][] = new int[][]; // jagged array won't have size mentioned or different size for internal arrays
```

Array of objects
code eg. is in `/Main/Demo.java`

## Strings - `Main/DemoStrings.java`
```
String name = new String("gowda");
String name = "bharath";
```
Both are same but the second one is read as first one by machine

String is a class unlike other primitive data types in java. This is the reason `String` is mentioned with capital letter `S` everytime string variable is used. And other data types will have small letter.

##### String constant pool
when there is same string value provided for different variables, strings are saved in heap memory with an address and that address will be referenecd in the variables.

```
String s1 = "bharath";
String s2 = "bharath";

s2 = s2 + "gowda";
```
Also, when string is modified as above, it is not going to replace the string value in the heap, it will just create a new one with new string value, as in this case, it is "bharath gowda" and the address for new string will be referenced to s2.

And at any point of time "bharath" string is not used anywhere, this will be treated as garbage data and would be cleared from heap memory.

##### Mutable and Immutable
Mutable strings are strings that can be changed
Immutable strings are strings that cannot be changed

All strings are Immutable strings.

String buffer and String builder can help in acheiving mutable strings.

##### Static variables
```
class Person {
  String name;
  int age;
  static String gender;

  public void show() {
    System.out.println("name " + name + " age " + age + " gender " + gender);
  }
}

public class Demo{
  public static void main(String[] a) {
    Person p1 = new Person();
    p1.name = "bharath";
    p1.age = 30;
    p1.gender = "male";

    Person p2 = new Person();
    p2.name = "soujanya";
    p2.age = 29;
    p2.gender = "female";

    p1.show();
    p2.show();

  }
}
```

Here gender will be shown female for both because gender is static variable meaning it is the same variable for the whole class. So changing its value for p1.gender will modify p2.gender as well. In fact, gender should be accessed as `Person.gender` since it is common now. Check the actual code in the file `/Main/DemoStrings.java`

##### Static Methods
Similar to static variables, static methods will be called pointing from the class since they will be available for the whole class, not in an object.

##### Static blocks
Similar to static variables and methods, block will be added to declare static variables or methods

# Encapuslation
Part of OOPS. Encapsulation means making the code or variables provate. 

For eg:
```
class Person {
  private String name;
  private int age;
}
// name and age won't be available outside of the class Person
System.out.println(name + " " + age);
```

But in order to access the private variables, methods will be used as in the code example in `Main/DemoStrings.java` file under EncapsulationExample class

Methods are also called as Getters and Setters, these can be generated in IDEs by right clicking.

Getters and Setters can be generated using right click in all IDEs, Source Action --> Getters and Setters --> select all the options
```
public int getAge() {
  return age;
}
public void setAge(int age) {
  this.age = age;
}
public String getName() {
  return name;
}
public void setName(String name) {
  this.name = name;
}
```

## this
this keyword referes to the current object. Refer the above code block for example.

## Constructor
Constructor is a method where assignment or any kind of operations occur. Preferably the name should same as the class.

```
class Person {
  private int age;
  private String name;
  // constructor
  public Person() {
    age = 30;
    name = "bharath"
  }

  public static show() {
    System.out.println()
  }
}
public class Demo {
  public static void main(String[] a) {
    Person p1 = new Person();
    Person p2 = new Person();
  }
}
```
Constructor would be called twice in this case and assign values to age and name to both objects p1 and p2.

Above is the default Constructor. There is Parameterized constructor too.

##### Ananymous objects
objects created without reference variables.
`new Person().show()` will create a new Person object and calls show method.

# Inheritance - `Main/InheritanceCalc.java`
Need of inheritance - when class A has specific methods or variables and class B has all methods same as class A but also few more. In this case, no need to write the same code twice, class B can extend its definition from class A. 

##### Single level inheritance
Extending Calc from AdvCalc in `Main/InheritanceAdvCalc.java` - Single level inheritance

##### Multi level inheritance
Extending AdvCalc from VeryAdvCalc (for example, code is not added), meaning VeryAdvCalc will have all the methods from AdvCalc and also Calc because AdvCalc is extending Calc. This is multi level inheritance.

##### Multiple inheritance
This is like, class A extends class B and class B extends class C, now class B and class C both have a method of same name, and if that method is called in class A object, it would not know which one to pick from on what basis. In Java, this is not supported. But we can use interfaces or mixins to acheive the similar functionality.

##### This and super method
super method is always there in the constructor by default even if not mentioned.

code example is in file `Main/InheritanceExample.java` for refernce.

Every class extends `Object` class in java.

##### Method overriding
Class A and Class B have the same method named `show` and class B extends class A, in this case, when show method is called with object, it would refer the class with which the object is created.
```
class A {
  public void show() {
    System.out.println("in class A Show method");
  }
}

class B extends A {
  public void show() {
    System.out.println("in class B Show method");
  }
}
```

example in `Main/InheritanceExample.java`

##### Packages
package is a mechanism for organizing related classes, interfaces and sub-packages into a structured heirarchy.

##### Access modifiers
public - should be in same package and will be accessed anywhere
private - can be accessed only in the same class irrespective of the package
default - can only be accessed in the same package
protected - can be accessed in the same package

int z = 2; // default 
public int x = 2; // public
private int y = 3; // private
protected int m = 3; // protected

##### Polymorphism and Dynamic method dispatch
poly - many, morphism - behavior
Compile time polymorphism and Run time polymorphism
Polymorphism can be defined as the reference variable behaving differently depending on the object that it refers to.

##### final
for constants, `final` keyword will be used, it means, the value will not be reassigned. Like const in javascript. `final` can be used with variables, methods and classes.

`final int a = 3;` - variable will be considered a constant and not allowed to be reassigned

`final class A {}` - class will not be allowed to extend to another classes

`public final void show() {}` - method will not be allowed to overriding

##### Object class
As we established earlier that each class extends Object class by default, this Object class has several methods available for use.
Eg: equals, toString and hasCode

when comparing objects, equals method can be used.

hashCode - gives an hash code in hexa decimal numbers for an object or a variable, etc

Source actions can be used from right click of mouse to generate custom hashCode and equals methods.

##### Upcasting and Downcasting
examples:
converting double to int - downcasting
converting int to double - upcasting

```
class A {
  public void show() {
    System.out.println("A show");
  }
}

class B extends A {
  public void show() {
    System.out.println("B show");
  }
}

public class Demo {
  public static void main(String[] a) {
    A a = new A(); // A type and A object
    a.show(); // default

    A b = new B(); // A type but B object
    b.show(); // this is upcasting, still works

    // but to make reference object to have B method though it is of object A, it needs to be downcasted as below
    B c = (A) b; // similar to typecasting or type conversion of int, double
  }
}
```

##### Wrapper class - `Main/DemoWrapper.java`
Wrapper class is a class wrapped around another class or an object. code example is added for better understanding

##### Abstract keyword
Abstract is used when a method is declared but not defined. And only abstract class can have abstract methods. Abstract methods will not be allowed to create objects for reference variables.

##### Inner class
A class can have another class also and it can be static too if needed. Refer the example in the file

##### Ananymous Inner class
A Inner class without a name is Ananymous inner class.

##### Interfaces
Interface is definition of what an object should have or a class should implement. By default methods are public and variables are final & static.

A class can implement multiple interfaces but can't extend multiple classes as we saw earlier.
And interfaces can extend another interface as classes.
```
interface Example1 {
  void show1();
}
interface Example2 {
  void show2();
}
interface Example3 extends Example2 {
  void show3();
}
class A implements Example1, Example2 {
  public void show1() {
    System.out.println("show1");
  }
  public void show2() {
    System.out.println("show2");
  }
}
// show2 should also be defined because Example3 is extending Example2 interface
class B implements Example1, Example3 {
  public void show1() {
    System.out.println("show1");
  };
  public void show2() {
    System.out.println("show2");
  };
  public void show3() {
    System.out.println("show3");
  };
}
```

##### enum
enum is class of constants defined similar to interface.

##### Annotations
@Override - for overriding the methods in defining classes
Annotations will be helpful for checking typos or simple mistakes.

##### Types of interfaces
Normal interface - has 2 or more than 2 methods defined
Functional (SAM) interface - SAM means Single Abstract Method - has single method defined
Marker interface - no methods defined or a blank interface
```
// functional interface
@FunctionalInterface
interface A {
  void show();
}
// normal interface
interface B {
  void show1();
  void show2();
}
// Marker interface
interface C {}
```
##### Lambda expression
Lambda expression can be used only with functional interface. Lambda expression is like arrow function in Javascript.
```
@FunctionalInterface
interface A {
  void show();
}
@FunctionalInterface
interface B {
  void show1(int i);
}
public class Demo {
  public static void main(String[] a) {
    A obj = () -> System.out.println("show method");
    obj.show();

    B obj2 = i -> System.out.println("show: " + i);
    obj2.show(3);
  }
}
```

# Exception - `Main/Exception.java`
3 types of errors Compile time errors, Run time errors and Logical errors
Run time errors and Logical errors can be handled using Exceptions.

Exception handling using try and catch
```
try {
  // actual code
} catch(ArithmeticException e) {
  System.out.println("wrong with arithmetic statement on this line");
} catch(Exception e) {
  System.out.println("Something went wrong" + e);
}
```

can work with multiple catch blocks if there are different exceptions. In this case, parent class Exception should be in the end because it can handle any type of exception and below catch blocks would be redundant or unreachable code

###### Exception heirarchy
Object --> Throwable --> 1. Exception and 2. Error
Exception --> Run time exception, SQL exception and IO exception, and etc
Run time exception --> Arithmetic exception, and etc

All the run time exceptions are called Unchecked exceptions
SQL exceptions and IO exceptions are called checked exceptions

##### `throw` and `throws` keywords
```
try {
  // do something
  if (failed) {
    throw new Exception("throws an exception");
  }
} catch (Exception e) {
  System.out.println("catches an exception");
}
```

can use custom excpetions as well
```
class MyException extends Exception {
  public MyException(String str) {
    super(str);
  }
}
try {
  // do something
  throw new MyException("custom exception");
} catch(MyException e) {
  System.out.println("catch my custom exception" + e);
}
```

##### throws
mainly used for checked exceptions - called as ducking exception for the behavior

# User inputs and Scanner

`System.out.println();` - in this line, System is a class yes, but println does not belong to System class. println is a method in PrintStream class which actually instantiates an object `out` which is null. PrintStream class actually extends System class.

BufferedReader can be used with InputStreamReader to get the input from user - this was in older versions, Java 1

Better to use Scanner to get input values from user.
```
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
System.out.println("num is " + num);
```
