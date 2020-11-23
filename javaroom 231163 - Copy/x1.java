import java.io.*;
class x1 {
	int a, b, c;
	void m()throws IOException{
	BufferedReader myget = new BufferedReader(new InputStreamReader(System.in));
	a = Integer.parseInt(myget.readLine());
	b = Integer.parseInt(myget.readLine());
	c = Integer.parseInt(myget.readLine());

   }
	void az()throws IOException{
	for(int i=65; i<=90; i++)
        {
            System.out.println((char)i);
        }
}


	
	public static void main(String args[]) throws IOException {

	x1 mim = new x1();
	mim.az();
	mim.m();
	for ( int x=mim.b; x <= mim.c; x++){
	System.out.println(mim.a + "*" + x + "=" + (mim.a*x));
	
  }
 }
}




      