package Main;
import java.util.Arrays;

class Calculator {
  public int add(int n1, int n2) {
    return n1 + n2;
  }
}

class Computer {

  int num = 5;
  // void is for returning nothing
  public void playMusic() { 
    System.out.println("Playing music...!");
  }

  // String if method is retunring string, int for integer, ...
  public String getMeAPen(int num) {
    if(num >= 10) return "Pen";
    return "Nothing";
  }
}

class Student {
  int rollNo;
  String name;
  int marks;
}

public class Demo {
  public static void main(String[] args) {
    int num1 = 2;
    int num2 = 3;

    Calculator calc = new Calculator();

    int result = calc.add(num1, num2);

    System.out.println("result is this " + result);

    Computer com = new Computer();

    com.playMusic();

    String penReceived = com.getMeAPen(2);
    System.out.println("pen received " + penReceived);

    // stack and heap
    System.out.println("com.num is " + com.num);
    // num is instance variable and will be stored in heap memory for com reference variable
    Computer com2 = new Computer();
    System.out.println("com2.num is " + com2.num);

    com2.num = 3;
    System.out.println("updated com2.num is " + com2.num);
    System.out.println("com.num won't be updated " + com.num);

    // Arrays
    int[] numArray = {1, 2, 3, 4, 5};
    System.out.println("numArray is " + numArray); // this won't log whole array
    // Arrays should be imported from java util as above ^
    System.out.println("numArray is " + Arrays.toString(numArray)); // this would log whole array
    System.out.println("numArray[2] is " + numArray[2]);
    // you can change the value in index
    numArray[2] = 1;
    System.out.println("after change numArray[2] is " + numArray[2]);
    System.out.println("numArray length is " + numArray.length);

    // assign an empty array of length 4 (all indexes will be having value 0)
    int emptyArray[] = new int[4];
    System.out.println("empty array[1] is " + emptyArray[1]);
    System.out.println("empty array length is " + emptyArray.length);
    // you can assign the value in each index also
    emptyArray[1] = 3;

    // multi-dimensional arrays
    int multiNumArray[][] = new int[3][4]; // array of 3 elements which are arrays of length 4
    int jaggedMultiNumArray[][] = new int[2][]; // jagged array won't have size mentioned
    // logging array
    for(int i = 0; i < multiNumArray.length; i++) {
      for(int j = 0; j < multiNumArray[i].length; j++) {
        System.out.print(multiNumArray[i][j] + " ");
      }
      System.out.println("");
    }

    // assigning the values to array using Math
    for(int i = 0; i < multiNumArray.length; i++) {
      for(int j = 0; j < multiNumArray[i].length; j++) {
        multiNumArray[i][j] = (int)(Math.random() * 10);
      }
    }

    // logging array after assigning
    for(int i = 0; i < multiNumArray.length; i++) {
      for(int j = 0; j < multiNumArray[i].length; j++) {
        System.out.print(multiNumArray[i][j] + " ");
      }
      System.out.println("");
    }

    // logging array by using enhanced for loop
    for(int n[]: multiNumArray) {
      for(int m: n) {
        System.out.print(m + " ");
      }
      System.out.println("");
    }

    // Array of objects
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();

    s1.name = "bharath";
    s1.rollNo = 1;
    s1.marks = 90;

    s2.name = "bhoja";
    s2.rollNo = 2;
    s2.marks = 91;

    s3.name = "raj";
    s3.rollNo = 3;
    s3.marks = 92;

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    // regular for loop
    for(int i = 0; i < students.length; i++) {
      System.out.println(students[i].name);
    }

    // enhanced for loop
    for(Student m: students) {
      System.out.println(m.name + " of roll number " + m.rollNo + " has marks " + m.marks);
    }
  }
}