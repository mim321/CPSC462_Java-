public class mim14 {
  public static void main(String[] args) {
    int mim,kajan;
    for (mim=1; mim <= 5; mim++) {
	for (kajan=1; kajan <= mim; kajan++)
		{
                    System.out.print(" ");
		}
	for (kajan=0; kajan < 2 ; kajan++)
                {
		    System.out.print(kajan+mim);
		}
	for (kajan=4; kajan >= mim; kajan--)
		{
                    System.out.print(" ");
                }
	for (kajan=4; kajan >= mim; kajan--)
		{
                    System.out.print(" ");
                }
	for (kajan=1; kajan < 3; kajan++)
                {
                    System.out.print(((mim+1)*2)-(kajan+mim));
                }          
	System.out.println();
    }
  }
}
