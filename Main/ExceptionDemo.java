package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// threads 
class A extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      // make the max to 100 to see the difference
      System.out.println("Hi");
      try {
        Thread.sleep(10);
      } catch(Exception e) {
        System.out.println("exception handled");
      }
    }
  }
}

// Schedules allow threads to execute on a time basis or for some time

class B extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      // make the max to 100 to see the difference
      System.out.println("Hello");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class C implements Runnable {
  public void run() {
    for(int i = 0; i <= 5; i++) {
      System.out.println("C thread");
      try {
        Thread.sleep(10);
      } catch(Exception e) {
        System.out.println("exception handled");
      }
    }
  }
}

class D implements Runnable {
  public void run() {
    for (int i = 0; i <= 5; i++) {
      System.out.println("D thread");
      try {
        Thread.sleep(10);
      } catch(Exception e) {
        System.out.println("exception handled");
      }
    }
  }
}

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
    // InputStreamReader in = new InputStreamReader(System.in);
    // BufferedReader input = new BufferedReader(in);
    // int bfNumber = Integer.parseInt(input.readLine());
    // System.out.println("buffered number value is " + bfNumber);

    // also similiar to below
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int num = Integer.parseInt(br.readLine());
    // System.out.println("num is " + num);


    // Scanner is introduced lately and can parse automatically and offers more build in methods
    // now Scanner will be used to do the same
    // Scanner sc = new Scanner(System.in);
    // System.out.println("input using scanner " + sc.nextInt());

    // try with finally
    // Scanner sc2 = null;
    // try {
    //   sc2 = new Scanner(System.in);
    //   System.out.println("sc2 entered is " + sc2.nextInt());
    // } finally {
    //   // finally block will get executed no matter if exception is thrown or not, 
    //   // also can be used without catch if no need to handle exception
    //   System.out.println("this is finally block");
    //   sc2.close(); // fields need to be closed once we receive input, buffered reader or scanner
    // }

    // or declaring in try parenthesis makes input field auto close
    // try(Scanner sc3 = new Scanner(System.in)) {
    //   System.out.println(sc3.nextInt());
    // } // no need of finally to close sc3, bcoz Scanner & BufferedReader implements Closable class

    // threads
    A obj1 = new A();
    B obj2 = new B();

    System.out.println("priority of obj1 " + obj1.getPriority()); // range goes from 1 to 10
    // obj1.setPriority(Thread.MAX_PRIORITY); to set the priority
    // obj1.start();
    // try {
    //   Thread.sleep(5);
    // } catch(InterruptedException e) {
    //   System.out.println("exception " + e);
    // }
    // obj2.start();

    // alternate way to run multiple threads at the same time using runnable interface
    Runnable obj3 = new C();
    Runnable obj4 = new D();
    
    Thread t1 = new Thread(obj3);
    Thread t2 = new Thread(obj4);
    t1.start();
    t2.start();

    // multiple threads using lambda expression and inline class
    Runnable obj5 = () -> {
      for (int k = 0; k <= 5; k++) {
        System.out.println("thread with inline class obj5");
        try {
          Thread.sleep(5);
        } catch(InterruptedException e) {
          System.out.println("exception");
        }
      };
    };

    Runnable obj6 = () -> {
      for(int k = 0; k <= 5; k++) {
        System.out.println("thread with inline class obj6");
        try {
          Thread.sleep(5);
        } catch (InterruptedException e) {
          System.out.println("Exception handled");
        }
      }
    };

    Thread t3 = new Thread(obj5);
    Thread t4 = new Thread(obj6);
    t3.start();
    t4.start();
  }
}
