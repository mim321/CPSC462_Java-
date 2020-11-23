import java.io.*;
import java.lang.*;
public class j0702 {
  public static void main (String args[]) throws IOException {
    int i = 1;
    String b;
    String[] fields;
    String patternStr = ",";
    FileReader fin = new FileReader("hello.csv");
    BufferedReader bin = new BufferedReader (fin);
    FileOutputStream fout = new FileOutputStream("data.htm");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    pout.println("<body bgcolor=pink><table border=1 width=100%>");
    while ((b =  bin.readLine()) != null) {
      fields = b.split(patternStr);
      pout.println("<tr>");
      pout.println("<td>"+i+"</td>");
      pout.println("<td>"+"ID = " + fields[0]+"</td>");
      pout.println("<td>"+"Name = " + fields[1]+"</td>");
      pout.println("<td>"+"Salary = " + fields[2]+"</td>");
      pout.println("<td>"+"Status = " + fields[3]+"</td>");
      pout.println("<td>"+ "<a href= "+fields[4]+">click</a>" +"</td>");
      pout.println("</tr>");
      i = i + 1;
    }
    pout.println("</table></body>");
    fin.close();
    pout.close();
  }
}
