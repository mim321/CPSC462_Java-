public class mim06 {
  public static void main(String[] args) {
    int mim,kajan;
    for (mim=1; mim <= 7; mim++) {
	for (kajan=1; kajan <= mim; kajan++)
                {
		System.out.print(" ");
                }
	for (kajan=6; kajan >= mim; kajan--)
                {
		System.out.print((kajan-1)%2);
                }
                System.out.print((mim)%2);
                
	for (kajan=mim; kajan <= 6; kajan++)
                {
		System.out.print((kajan-1)%2);
                }
	System.out.println();
    }
  }
}
