public class mim02 {
  public static void main(String args[]) {
    int totalRow = 4;
    for (int mim=1; mim <= totalRow; mim++) {
      // Column have 2 parts
      for (int kajan=mim; kajan <= (mim+2); kajan++) { System.out.print(kajan); }
      for (int kajan=1; kajan <= (2+mim); kajan++) { System.out.print("*"); }
      System.out.println();
    }
  }
}