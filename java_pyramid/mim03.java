public class mim03 {
  public static void main(String args[])   {
    int totalRow = 4;
    for (int mim=1; mim <= totalRow; mim++) {
      // Column have 3 parts 
      System.out.print(mim + "" + (mim + 4));
      for (int kajan=1; kajan <= (4 + mim); kajan++) { 
        System.out.print("*"); 
      }
      System.out.println();
    }
  }
}