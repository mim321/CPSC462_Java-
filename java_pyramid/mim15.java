public class mim15 {
  public static void main(String[] args) {
    int mim,kajan;
    for (mim=1; mim <= 5; mim++) {
	for (kajan=mim; kajan >= 1; kajan--)
                {
                    System.out.print(kajan);
                }
	for (kajan=mim; kajan <= 4; kajan++)
                {
                    System.out.print(" ");
                }
	for (kajan=mim; kajan <= 4; kajan++)
                {
                    System.out.print(" ");
                }
	for (kajan=mim; kajan >= 1; kajan--)
                {
                    System.out.print("*");
                }            
	System.out.println();
    }
  }
}
