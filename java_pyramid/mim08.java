public class mim08 {
  public static void main(String[] args) {
    int mim,kajan;
    for (mim=1; mim <= 7; mim++) {
	for (kajan=1; kajan <= mim; kajan++)
		{
		   System.out.print(" ");
		}
	for (kajan=0; kajan < 3; kajan++)
		{
		   System.out.print(kajan+mim);
		}
	for (kajan=0; kajan <= mim; kajan++)
		{
		   System.out.print("*");
		}
	System.out.println();
    }
  }
}
