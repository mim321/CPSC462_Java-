public class mim05 {
  public static void main(String[] args) {
	int mim,kajan;
	for (mim=1; mim <= 4; mim++) {            
		for (kajan=4; kajan >= mim; kajan--)
                {
                    System.out.print(" "); 
                }
                    System.out.print(mim); 
		for (kajan=2; kajan <= mim; kajan++)
                {
                    System.out.print("**"); 
                }
                    System.out.print(mim); 
		System.out.println(); 
            }
	for (mim=2; mim <= 4; mim++)
            {
		for (kajan=1; kajan <= mim; kajan++)
                {
                    System.out.print(" "); 
                }
                    System.out.print(5-mim); 
		for (kajan=3; kajan >= mim; kajan--)
                {
                    System.out.print("**");
                }
                    System.out.print(5-mim); 
		System.out.println();
	}
  }
}