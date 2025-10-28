# Overview 
  JAVA is a platform independent language. 

  Installing JDK - JRE will be in JDK and JVM will be in JRE

  JVM is platform dependent but not JAVA

  to print something - System.out.print()

  to print in separate line - System.out.ptintln()

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