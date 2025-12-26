package Main;

class Person {

  static {
    String gender = "male";
  }

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

public class DemoStrings {
  public static void main(String[] a) {
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

    // Static methods
    Person.show1(p1);

    // Static block ^^ above

    
  }
}