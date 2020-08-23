public class mim12 {
  public static void main(String[] args) {
    int mim,kajan;
    for (mim=1; mim <= 5; mim++) {
	for (kajan=1; kajan <= mim; kajan++)
		{
		    System.out.print(" ");
		}
	for (kajan=mim; kajan <= 4 ; kajan++)
                {
                    System.out.print(kajan);
                }
		    System.out.print("5");
	for (kajan=4; kajan >= mim; kajan--)
		{
		    System.out.print(10-kajan);
		}
	System.out.println();
    }
  }
}
