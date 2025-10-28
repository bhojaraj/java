package Basics;

public class Loops {
  
  public static void main() {

    int a = 1;
    // while loop
    while(a < 5) {
      System.out.println("a is " + a);
      a++;
    }

    int b = 10;
    // do while loop
    do {
      System.out.println("b is " + b);
      b++;
    } while(b < 5);

    // for loop
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    int j = 5;
    for (;j>0;) {
      System.out.println(j);
      j--;
    }
  }
}
