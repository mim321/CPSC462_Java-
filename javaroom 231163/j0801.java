// program id : 32
// 1. �Ѻ��Ҩҡ�鹾������� System.in.read 
// 2. ������͡���������� data.txt �����ʴ�����¹���ç
// 3. ���Ҵ��� .equals()
import java.io.*;
public class j0801 {
  public static void main (String args[]) throws IOException {
   BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    int found=0;
    char buf;
    String b,g,g1 = ""; 
    g = ""; 
    String[] fields;
    System.out.println("Wait id and end character with [x]");
    g = stdin.readLine();
    g1 = stdin.readLine();

    FileReader fin = new FileReader(g1);
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      fields = b.split(",");
      if (fields[0].equals(g)) {
        System.out.println(fields[1]);
        found = 1;
      }
    }

    if (found == 0) System.out.println("Not found");
    fin.close();
  }
}