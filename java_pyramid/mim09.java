public class mim09 {
  public static void main(String[] args) {
    int mim,kajan;
    for (mim=1; mim <= 5; mim++) {
	for (kajan=1; kajan <= mim; kajan++)
		{
		   System.out.print(" ");
		}
	for (kajan=4; kajan >= mim; kajan--)
                {
		   System.out.print(mim);
                }
		   System.out.print(mim);
	for (kajan=4; kajan >= mim; kajan--)
                {
                   System.out.print(mim);
                }           
	System.out.println();
    }
  }
}
