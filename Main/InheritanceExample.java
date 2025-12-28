package Main;

class SuperExample1 {
  public SuperExample1() {
    super();
    System.out.println("SuperExample1 default constructor");
  }

  public SuperExample1(int n) {
    super();
    System.out.println("SuperExample1 parameterized constructor");
  }

}

class SuperExample2 extends SuperExample1 {
  public SuperExample2() {
    super();
    System.out.println("SuperExample2 default constructor");
  }

  public SuperExample2(int n) {
    super(n); // if n is not passed, SuperExample1 default constructor would run always
    // this();
    System.out.println("SuperExample2 parameterized constructor");
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

    // Method overriding
    
  }
}