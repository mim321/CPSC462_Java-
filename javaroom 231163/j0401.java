public class j0401 {
  public static void main(String args[]) {
    sub1(); sub2(); sub1();
  }
  static void sub1() { 
    System.out.print("x");
  }
  static void sub2() { System.out.print("y"); }
}