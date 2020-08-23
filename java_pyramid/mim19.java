public class mim19 {
  public static void main(String[] args) {
    int mim,kajan;
    for (mim=1; mim <= 5; mim++) {
	System.out.print(mim);
	for (kajan=mim; kajan <= 9; kajan++)
		{
		     System.out.print("*");
                }
	for (kajan=2; kajan <= mim; kajan++)
		{
		    System.out.print(" ");
		}
		    System.out.print(6-mim);
	System.out.println();
    }
  }
}
