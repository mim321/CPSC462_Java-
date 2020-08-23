public class mim21 {
  public static void main(String[] args) {
    int mim,kajan;
    for (mim=1; mim <= 5; mim++) {
	for (kajan=mim; kajan <= 7; kajan++)
		{
		    System.out.print("*");
		}
		    System.out.print(mim);
	for (kajan=1; kajan <= mim; kajan++)
                {
		    System.out.print("*");
		}
		    System.out.print(8-mim);
	System.out.println();
    }
  }
}
