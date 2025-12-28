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

# Overview 
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

# Statements (Conditional Statements)

##### If else statement
##### If else if statement
##### Ternary operator / statement
##### Switch statement

refer examples for considtional statements here java/Basics/Statements.java

# Loops
Needed for some repeated operations

##### While loop
##### Do While loop
##### For loop

refer examples for loops here java/Basics/Loops.java

# Main concepts

## Classes
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

## Strings
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

# Inheritance
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

