// program id : 23
// Read each char from j0603.java and println all char
import java.io.*;
public class j0603 {
  public static void main (String args[]) throws IOException {
    
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    int n = 0;
    byte b[] = new byte[128];
    FileOutputStream fout1 = new FileOutputStream("out.txt");
    FileInputStream fin = new FileInputStream(stdin.readLine());
    while ((n = fin.read(b)) != -1) {
      for(int i=0;i<n;i++) {
		if(b[i] == 10) {
		fout1.write(10);
      		fout1.write('-');
     }
        else { fout1.write((char)b[i]); } 
  
    }
}

      fout1.close(); 
    

    System.out.println(n = fin.read(b)); // -1 = not found
    fin.close();
  }
}