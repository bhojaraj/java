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

###### Classes
Class is what you need to create objects. Class is a user-defined type that describes what an object looks like. Like structure and behavior of the object.

Class is what defines the object and in order to use any method in class, reference variable should be used and assigned with new copy of class and methods can be accessed.

###### Methods

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

##### Stack and Heap

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