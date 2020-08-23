public class mim11 {
  public static void main(String[] args) {
    int mim,kajan;
    for (mim=1; mim <= 5; mim++) {
	for (kajan=5; kajan >= mim; kajan--)
                {
                    System.out.print(" ");
                }	
                System.out.print(mim);
	for (kajan=2; kajan <= mim; kajan++)
                {
                    System.out.print(" ");
                }
                    System.out.print(mim);
	System.out.println();
    }
  }	
}
