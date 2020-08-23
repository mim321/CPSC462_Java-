public class mim07 {
  public static void main(String[] args) {
    int mim,kajan;
    for (mim=1; mim <= 7; mim++) {
    for (kajan=7; kajan >= mim; kajan--)
	{
	  System.out.print(" ");
	}
    for (kajan=1; kajan <= mim; kajan++)
	{
	  System.out.print(kajan);
	}
	  System.out.print(mim);
    for (kajan=mim; kajan >= 1; kajan--)
	{
	  System.out.print(kajan);
	}
    System.out.println();
    }
  }
}
