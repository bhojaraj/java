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

  }
}