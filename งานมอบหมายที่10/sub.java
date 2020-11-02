import java.io.*;
class sub {
  public static void main (String args[]) throws IOException {
    int i = 0,d;
    String b;
    String[] fields;
    String[] recs = new String[10];
    String patternStr = ",";
    
    FileReader header = new FileReader("h.txt");
    BufferedReader header1 = new BufferedReader (header);
    
    FileReader footer = new FileReader("f.txt");
    BufferedReader footer1 = new BufferedReader (footer);
    
    FileReader fin = new FileReader("sub.txt");
    BufferedReader bin = new BufferedReader (fin);

    FileOutputStream fout = new FileOutputStream("sub.htm");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
   
    while ((b =  bin.readLine()) != null) {
      recs[i] = b;
      i = i + 1;
    }
    fin.close();
    
    while ((b =  header1.readLine()) != null) {
        pout.println(b);
      }header.close();

    pout.println("<body bgcolor=red><table border=1 width=100% >");
    for(int j=0;j<i;j++) {
      fields = recs[j].split(patternStr);
      pout.println("<tr>");
      pout.print("<td>"+fields[0]+"</td>");
      pout.print("<td>"+fields[1]+"</td>");
     // pout.print("<td>"+fields[2]+"</td>");
      //if (d = Integer.valueOf(fields[2]="A").intValue()){
       // pout.print("<td>"+fields[3]+"</td>");
      //}
     // pout.print("<td>"+d+"</td>");
      pout.println("</tr>");
    }fin.close();
    pout.println("</table></body>");

    while ((b =  footer1.readLine()) != null) {
      fields = b.split(patternStr);
      pout.println(b);
    }footer.close();
    pout.close();
  }
}