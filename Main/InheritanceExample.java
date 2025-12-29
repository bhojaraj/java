package Main;

import Basics.Loops;
class SuperExample1 {
  public SuperExample1() {
    super();
    System.out.println("SuperExample1 default constructor");
  }

  public SuperExample1(int n) {
    super();
    System.out.println("SuperExample1 parameterized constructor");
  }

  public void show() {
    System.out.println("SuperExample1 show");
  }

}

class SuperExample2 extends SuperExample1 {
  int a = 3; // access modifiers
  public SuperExample2() {
    super();
    System.out.println("SuperExample2 default constructor");
  }

  public SuperExample2(int n) {
    super(n); // if n is not passed, SuperExample1 default constructor would run always
    // this();
    System.out.println("SuperExample2 parameterized constructor");
  }

  public void show() {
    System.out.println("SuperExample2 show");
  }
}

public class InheritanceExample {
  public static void main(String[] a) {
    InheritanceCalc calc = new InheritanceCalc();

    int r1 = calc.addition(3, 5);
    int r2 = calc.substract(3, 5);
    System.out.println(r1 + " " + r2);

    // will use AdvCalc for addition and substract using inheritance
    InheritanceAdvCalc advCalc = new InheritanceAdvCalc();

    int r3 = advCalc.multiply(3, 5);
    int r4 = advCalc.divide(15, 4);
    int r5 = advCalc.addition(3, 5);
    int r6 = advCalc.substract(5, 3);
    System.out.println(r3 + " " + r4 + " " + r5 + " " + r6);

    // this and super method
    SuperExample2 s1 = new SuperExample2(); // logs from deault constructor for both classes
    SuperExample2 s2 = new SuperExample2(4);
    // logs from parameterized constructor of SuperExample2 class and default from SuperExample1 ^
    // unless super method in SuperExaple2 constructor sends n parameter from SuperExample1
    // parameterized constructor will not be accessed

    // this keyword
    // in order to log SuperExample1 default constructor, SuperExample2 default constructor and
    // SuperExample2 parameterized constructor
    // instead of super() method, this() method should be used in SuperExample2 parameterized
    // constructor to acheive the above

    // Method overriding - eg added in readme file

    // Access modifiers
    SuperExample2 s3 = new SuperExample2();
    System.out.println(s3.a); // can be accessed because it is default when not mentioned anything

    Loops s4 = new Loops();
    // System.out.println(s4.x); // since default and not in the same package, not accessible
    System.out.println(s4.y); // available because it is public
    InheritanceCalc s5 = new InheritanceCalc();
    System.out.println(s5.z); // since default and in the same package, can access
    System.out.println(s5.m); // since protected and in the same package, can access
    // System.out.println(s4.z); // not accessible, z is protected but in the different package

    // Polymorphism
    SuperExample1 s6 = new SuperExample1();
    s6.show();

    SuperExample2 s7 = new SuperExample2();
    s7.show();

    SuperExample1 s8 = new SuperExample2();
    s8.show();

    // SuperExample2 s9 = new SuperExample1(); // error, parent cannot be converted to child

  }
}