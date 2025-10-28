package Basics;
class Hello {

  public static void main() {
    System.out.println("hello world");
    int num = 8;
    int num2 = 3;
    System.out.println(num + num2);
    
    char b = '&';
    System.out.println(b);

    String name = "bharath";
    System.out.println(name);
    
    float num3 = 5.6f;
    double num4 = 5.6;
    System.out.println(num3);
    System.out.println(num4);

    boolean bool1 = true;
    System.out.println(bool1);

    /*
     * Type conversion

     these are explicit conversion since we need to mention the type that it needs to converted
    // byte to int, no issue
    */
    byte c = 33;
    System.out.println(c);
    int d = c;
    System.out.println(d);

    // int to byte
    int e = 257;
    System.out.println(e);
    byte f = (byte)e;
    System.out.println(e);

    // float to int
    float g = 3.8f;
    System.out.println(g);
    int h = (int) g;
    System.out.println(h);

    // regular conversion, int has more range, so no error
    byte i = 33;
    int j = i;
    System.out.println(j);

    // type promotion
    byte k = 10;
    byte l = 30;
    int result = k * l;
    System.out.println(result);
  }
}