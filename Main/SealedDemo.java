package Main;

sealed class A permits B, C {

}

non-sealed class B extends A {

}

final class C extends A {

}

class D extends B { // D can extend B as B is non-sealed and available for other classes

}

class E { // E cannot extend A because it is only permitted by B and C

}

record Alien(int id, String name) { }

public class SealedDemo {
  public static void main(String[] a) {
    A b = new A();

    var a1 = new Alien(1, "Bharath");
    var a2 = new Alien(2, "Gowda");
    var a3 = new Alien(1, "Bharath");

    System.out.println(a1);
    System.out.println(a2);

    System.out.println(a1.equals(a2)); // false as expected
    System.out.println(a1.equals(a3)); // true because record class checks and compare the values
    // instead of the location by default, which actually returns false because they are 2
    // different objects and referencing to different location in the memory.

    // record classes are immutable
    // a1.setId is not available 
  }
}