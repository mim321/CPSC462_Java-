public class mim04 {
  public static void main(String args[]) {
    int totalRow = 4;
    for (int mim=1; mim <= totalRow; mim++) {
      // Column have 3 parts 
      for (int kajan=1; kajan <= mim; kajan++) { System.out.print("*"); }
      for (int kajan=mim; kajan >= 2; kajan--) { System.out.print(kajan); }
      for (int kajan=1; kajan <= mim; kajan++) { System.out.print(kajan); }
      System.out.println();
    }
  }
}