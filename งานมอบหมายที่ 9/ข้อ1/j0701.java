import java.io.*;
public class j0701 {
  public static void main (String args[]) throws IOException {
  BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
  String getid = stdin.readLine();
    int i = 1;
    //int tot = 0;
    String b;
    String[] fields;
    String patternStr = ","; // this var may be removed
    FileReader fin = new FileReader("dataZC.txt");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      fields = b.split(patternStr);
      if (fields[0].equals(getid)){
      	//System.out.println("id : " + fields[0]);
      	System.out.println("zip : " + fields[1]);
      	//System.out.println("province : " + fields[2]);
      	//System.out.println("district : " + fields[3]);
      	System.out.println("lat : " + fields[4]);
      	System.out.println("lng : " + fields[5]);
     }
      //tot = tot + Integer.parseInt(fields[3]);
      i = i + 1;
    }
    //System.out.println("Total : " + tot);
    fin.close();
  }
}