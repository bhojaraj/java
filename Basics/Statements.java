package Basics;
class Statements {
  int b = 4;

  public static void main(String[] args) {
    int x = 8;

    // For single statements, no need of blocks {}
    if (x > 10)
      System.out.println("Hi");
    else
      System.out.println("Bye");

    // ternary
    System.out.println(x > 10 ? "Hi" : "Bye");

    // Switch examples
    String a = "Sunday";

    // Basic Switch
    switch(a) {
      case "Sunday":
        System.out.println("This is Sunday");
        break;
      case "Monday":
        System.out.println("This is Monday");
        break;
      default:
        System.out.println("This is default");
        break;
    }

    // different way switch
    switch(a) {
      case "Saturday", "Sunday": 
        System.out.println(a == "Saturday" ? "This is Saturday" : "This is Sunday");
      default:
        System.out.println("this is default");
    }

    // different way switch
    String result = "";
    switch(a) {
      case "Sunday" -> result = "this is sunday";
      default -> result = "this is default";
    }
    System.out.println("result is this " + result);

    // Switch as expression
    String anotherResult = switch(a) {
      case "Saturday" -> "This is saturday";
      case "Monday" -> "This is Monday";
      default -> "This is default case";
    };
    System.out.println("anotherResult is" + anotherResult);

    // Switch as expression
    String yetAnotherResult = switch(a) {
      case "Saturday": yield "This is saturday"; // another syntax if you want ; to be used instead of ->
      case "Monday": yield "This is Monday";
      default: yield "This is default case";
    };
    System.out.println(yetAnotherResult);

  }
}