package Main;

abstract class Car {
  public abstract void drive();

  public void playMusic() {
    System.out.println("play music");
  }
}

class Baleno extends Car {
  public void drive() {
    System.out.println("driving");
  }
}

class OuterClass {
  int age;
  public void show() {
    System.out.println("show method");
  }

  class InnerClass {
    public void config() {
      System.out.println("config method");
    }
  }

  static class StaticInnerClass {
    public void config1() {
      System.out.println("config method from static inner class");
    }
  }
}

// interface is like an abstract class without abstract
interface InterfaceExample {
  int age = 30;
  String location = "Bengaluru"; // variable by default, final and static, so should be initialized
  void showExample(); // public is default for methods, even if not mentioned in interface
  void display();
}

class InterfaceClassExample implements InterfaceExample {
  public void display() {
    System.out.println("display");
  }
  public void showExample() {
    System.out.println("showExample");
  }
}

interface Computer {
  void code();
}
class Laptop implements Computer {
  public void code() {
    System.out.println("coding");
  }
}

class Desktop implements Computer {
  public void code() {
    System.out.println("coding in desktop");
  }
}
class Developer {
  public void code(Computer com) {
    com.code();
  }
}

enum EnumExample {
  Running, Walking, Cycling, Swimming
}

enum Laptops {
  MacBook(2000), Surface(2800), ThinkPad(1000), ASUS(1800);

  private int price;
  private Laptops(int p) {
    this.price = p;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
}

// functional interface
@FunctionalInterface
interface A {
  void show();
}

@FunctionalInterface
interface B {
  int add(int a, int b);
}

public class DemoWrapper {
  public static void main(String[] a) {
    int num = 2; 
    // integer num value is assigned to num1 of type Integer class
    Integer num1 = num; // auto boxing
    // this is similar to 
    // Integer num2 = new Integer(num); // this has been deprecated
    // int num3 = num1.intValue(); similar to what we have below, but this is manual way
    int num4 = num1; // auto unboxing

    String str = "12";
    int num5 = Integer.parseInt(str); // makes num5 value as integer 5

    // abstract
    // Car myCar = new Car(); // this will throw error, since it is abstract class
    Car myCar = new Baleno();
    myCar.playMusic();
    myCar.drive();

    // Inner class
    OuterClass outCls = new OuterClass();
    int age = outCls.age;
    outCls.show();
    // outCls.config(); config won't be available like this
    OuterClass.InnerClass inCls = outCls.new InnerClass();
    inCls.config();

    // or if inner class is static
    OuterClass.StaticInnerClass inCls1 = new OuterClass.StaticInnerClass();
    inCls1.config1();

    // Ananymous inner class
    outCls.show();
    OuterClass outCls2 = new OuterClass()
    {
      public void show() {
        System.out.println("in new show method");
      }
    };
    outCls2.show();

    // abstract and ananymous inner class
    Car myCar2 = new Car()
    {
      public void drive() {
        System.out.println("new show from anaymous");
      }
    };
    myCar2.drive();

    // interface
    InterfaceClassExample ex = new InterfaceClassExample();
    ex.display();
    ex.showExample();
    int n = InterfaceExample.age;
    String l = InterfaceExample.location;

    Computer lap = new Laptop();
    Computer desk = new Desktop();
    Developer devName = new Developer();

    devName.code(lap);
    devName.code(desk);

    // enum
    EnumExample s = EnumExample.Running;
    System.out.println("s value is " + s);
    System.out.println(("ss is " + s.ordinal()));

    EnumExample[] ss = EnumExample.values();
    System.out.println(("ss is " + ss[0]));
    for (EnumExample i: ss) {
      System.out.println(i + " " + i.ordinal());
    }

    Laptops laptop = Laptops.MacBook;
    System.out.println("laptop is " + laptop + " : " + laptop.getPrice());

    for(Laptops lapo: Laptops.values()) {
      System.out.println("laptop is " + lapo + " : " + lapo.getPrice());
    }

    // lambda expression
    A obj = () -> System.out.println("this is lambda expression"); // this is single line
    obj.show();

    // if multiple lines are there in method
    A obj1 = () -> {
      System.out.println("this is also lambda expression");
      System.out.println("but with multiple statements in method");
    };
    obj1.show();

    // lambda expression with returning some values
    B obj2 = (i, j) -> i + j; // int and return no need to be mentioned
    int result = obj2.add(2, 3);
    System.out.println("result is " + result);
  }

}
