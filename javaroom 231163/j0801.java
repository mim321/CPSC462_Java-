// program id : 32
// 1. รับค่าจากแป้นพิมพ์ด้วย System.in.read 
// 2. นำไปเลือกข้อมูลในแฟ้ม data.txt แล้วแสดงระเบียนที่ตรง
// 3. ค้นหาด้วย .equals()
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