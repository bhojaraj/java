package Main;

class Mobile {
  // static block example
  String brand;
  int price;
  static String type;
  
  static {
    type = "smartphone";
    System.out.println("static block, only called once");
  }
  public Mobile() {
    brand = "apple";
    price = 1200;
    System.out.println("constructor will be called more than once, depending on constructing a new object");
  }

  public void show() {
    System.out.println("brand is " + brand + " price is " + price + " and type is " + type);
  }
}

class Person {

  String name;
  int age;
  static String gender; // static variable

  public void show() {
    // this is instance method
    System.out.println("name " + name + " age " + age + " gender " + gender);
  }

  public static void show1(Person obj) {
    // this is static method
    System.out.println("similar to static variable, it can be accessed as Person.show1()");

    // System.out.println("name " + name + " age " + age + " gender " + gender);
    // since name and age are not static variables, they won't be available directly
    // but to access them, obj needs to be passed when called

    System.out.println("name " + obj.name + " age " + obj.age + " gender " + gender);
  }
}

class EncapsulationExample {
  private int age;
  private String name;
  // constructor
  public EncapsulationExample() {
    age = 30;
    name = "bharath";
  }

  // parameterized constructor
  public EncapsulationExample(int age, String name) {
    this.age = age;
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public String getName() {
    return name;
  }
  public void setAge(int num) {
    age = num;
  }
  public void setName(String str) {
    name = str;
  }
}

public class DemoStrings {
  public static void main(String[] a) throws ClassNotFoundException {
    // String name = new String("gowda"); // same as below
    String name = "bharath";

    System.out.println(name.length());
    System.out.println(name.hashCode());
    System.out.println(name.charAt(1));

    StringBuffer sb = new StringBuffer();
    // 16 is minimum space capacity by defaultif provided with initial string like below, 
    // new StringBuffer("bharath"), then capacity would be 16 + (number of provided characters)

    System.out.println(sb.capacity());
    sb.append("bharath");
    System.out.println(sb.capacity());

    sb.charAt(2);
    sb.insert(2, "gowda");
    System.out.println(sb);

    // Static variables example, age will be static (check in class above)
    Person p1 = new Person();
    p1.name = "bharath";
    p1.age = 30;
    Person.gender = "male";

    Person p2 = new Person();
    p2.name = "soujanya";
    p2.age = 31;
    Person.gender = "female";

    p1.show();
    p2.show();

    // Static method
    Person.show1(p1);

    // Static block ^^ above
    Mobile m1 = new Mobile();
    m1.show();

    // To call static method without having to use them in the main method
    // Class.forName("Mobile");

    // Encapsulation
    EncapsulationExample e1 = new EncapsulationExample();
    System.out.println(e1.getAge()); // logs 0 because not assigned value yet

    // e1.age = 3; // this won't work
    // System.out.println(e1.getAge());

    // in order to assign values to object e1, should be using public methods for setting
    e1.setAge(29);
    e1.setName("bharath");
    System.out.println(e1.getName() + " : " + e1.getAge());

    // constructor
    EncapsulationExample e3 = new EncapsulationExample();
    System.out.println(e3.getName() + " : " + e3.getAge());

    // parameterized constructor
    EncapsulationExample e4 = new EncapsulationExample(31, "soujanya");
    System.out.println(e4.getName() + " : " + e4.getAge());

  }
}