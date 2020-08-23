public class mim10 {
  public static void main(String[] args) {
    int mim,m;
    for (mim=1; mim <= 5; mim++) {
	for (m=5; m >= mim; m--)
		{
		    System.out.print(" ");
		}
	for (m=1; m <= mim; m++)
                {
                    System.out.print(m);
                }
                System.out.print(6-mim);
	for (m=mim; m >= 1; m--)
                {
                    System.out.print(m);
                }
            
	System.out.println();
   }
  }
}
