package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionDemo {
  public static void main(String[] a) throws IOException {
    
    int i = 0;
    int j = 0;

    try {
      j = 3/i;
    } catch (Exception e) {
      System.out.println("i cannot be " + i);
      System.out.println("exception object " + e);
    }

    System.out.println("will proceed to execute next lines");

    System.out.println("Enter a number");
    // int num = 0;
    // num = System.in.read(); // this gives ASCII values of the input value, not the actual input
    // System.out.println("num entered is " + num);

    // to get actual values entered, BufferedReader needs to be used, this was before java version1
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(in);
    int bfNumber = Integer.parseInt(input.readLine());
    System.out.println("buffered number value is " + bfNumber);

    // now Scanner will be used to do the same
    Scanner sc = new Scanner(System.in);
    System.out.println("input using scanner " + sc.nextInt());
  }
}
