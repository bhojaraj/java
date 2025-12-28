package Main;

public class InheritanceAdvCalc extends InheritanceCalc {
  public int multiply(int n1, int n2) {
    return n1 * n2;
  }

  public int divide(int n1, int n2) {
    return n1 / n2;
  }

  // method overriding
  public int addition(int n1, int n2) {
    System.out.println("overriding addition method");
    return n1 + n2;
  }
}
