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

  }

}
