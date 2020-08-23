public class mim32 {
  public static void main(String[] args) {
    int mim,m;
    for (mim=1; mim <= 5; mim++) {
	for (m=7; m >=mim; m--)
                {
                    System.out.print(8-m);
                }
	for (m=1; m <= mim+2; m++)
                {
                    System.out.print("*");
                }
		    System.out.print(mim+2) ;  
	System.out.println();
    }
  }
}
