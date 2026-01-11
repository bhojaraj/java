package Main;

public class InheritanceCalc {
  int z = 2; // default 
  public int x = 2; // public
  private int y = 3; // private
  protected int m = 3; // protected
  final int n = 3; // final like a constant, can never reassign the value

  public int addition(int n1, int n2) {
    return n1 + n2;
  }

  public int substract(int n1, int n2) {
    return n1 - n2;
  }
}
