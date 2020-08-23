public class mim33 {
  public static void main(String[] args) {
    int mim,m;
    for (mim=1; mim <= 3; mim++) {
	for (m=3; m >= mim; m--)
                {
                    System.out.print(" ");
                }
	for (m=1; m <= mim; m++)
                {
                    System.out.print("*");
                }
	for (m=2; m <= mim; m++)
                {
                    System.out.print("*");
                }               
	System.out.println();
            	}
    for (mim=1; mim <= 2; mim++) {
	for (m=1; m <= mim+1; m++)
                {
                    System.out.print(" ");
                }
	for (m=mim; m <= 2; m++)
                {
                    System.out.print("*");
                }
	for (m=mim; m <= 1; m++)
                {
                    System.out.print("*");
                }
	System.out.println();
    }
  }
}
