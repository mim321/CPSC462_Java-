public class mim13 {
  public static void main(String[] args) {
    int mim,kajan;
    for (mim=1; mim <= 5; mim++){
	for (kajan=2; kajan <= mim; kajan++)
		{
		    System.out.print(" ");
		}
	for (kajan=1; kajan <= mim; kajan++)
		{
		    System.out.print(" ");
                }
                        
	for (kajan=mim; kajan <= 10-mim; kajan++)
                {
		    System.out.print(11-kajan-mim);
                }
	System.out.println();
    }
  }
}
