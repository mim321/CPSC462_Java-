public class mim22 {
  public static void main(String[] args) {
    int mim,m;
    for (mim=1; mim <= 5; mim++) {
	System.out.print("*");
	for (m=2; m <= mim; m++)
		{
                    System.out.print(" ");
		}
	for (m=mim; m <= 5; m++)
                {
		    System.out.print(mim);
                }
	for (m=mim; m <= 4; m++)
		{
		    System.out.print(mim);
                }
	for (m=2; m <= mim; m++)
                {
                    System.out.print(" ");
                }
		    System.out.print("*");
	System.out.println();
    }
  }
}
