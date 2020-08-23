public class mim18 {
  public static void main(String[] args) {
    int mim,kajan;
    for (mim=1; mim <= 5; mim++) {
	System.out.print(mim);
	for (kajan=1; kajan <= mim; kajan++)
                {
                    System.out.print("*");
                }
		    System.out.print(mim);
	for (kajan=5; kajan >= mim; kajan--)
		{
		    System.out.print("*");
		}
		    System.out.print(10-mim);
	System.out.println();
    }
  }
}
