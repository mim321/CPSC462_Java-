import java.io.*;
class hello
{
  public static void main (String args[]) throws IOException 
  {
    int i=0;
    //int 4 = 4; 
    int q[] = new int[4];
    String b;
    String[] fields;
    //String , = ",";
    FileReader fin = new FileReader("hello.csv");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      fields = b.split(",");
      for (int j=1;j<=4-1;j++) 
        q[j]+= Integer.parseInt(fields[j]);
        i = i + 1;
    }
    System.out.println("Total questions: " + i);
    for (int j=1;j<=4-1;j++)
      System.out.println(j+":"+q[j]+" | "+(q[j] * 100 / i)+"%");
    fin.close();
  }
}