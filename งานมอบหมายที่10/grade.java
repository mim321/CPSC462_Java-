import java.io.*;
import java.lang.*;
class grade {
public static void main (String args[]) throws IOException {
int i = 0;
String b,f,h;
String[] fields;
String patternStr = ",";
FileReader finF = new FileReader("f.txt");
BufferedReader binF = new BufferedReader (finF);

FileReader finH = new FileReader("h.txt");
BufferedReader binH = new BufferedReader (finH);

FileReader fin = new FileReader("grade.txt");
BufferedReader bin = new BufferedReader (fin);

FileOutputStream fout = new FileOutputStream("grade.htm");
BufferedOutputStream bout = new BufferedOutputStream(fout);
PrintStream pout = new PrintStream(bout);

while ((f =  binH.readLine()) != null) {pout.println(f);}
pout.println("<body bgcolor=yellow><table border=1 width=100%>");
while ((b =  bin.readLine()) != null) {
fields = b.split(patternStr);

pout.println("<tr>");
pout.println("<td>"+ fields[0]+"</td>");
pout.println("<td>"+fields[1]+"</td>");
pout.println("<td>"+fields[2]+"</td>");
if(fields[2].equals("A")){pout.println("<td>"+"4"+"</td>");}
else if(fields[2].equals("B")){pout.println("<td>"+"3"+"</td>");}
else if(fields[2].equals("C")){pout.println("<td>"+"2"+"</td>");}
else if(fields[2].equals("D")){pout.println("<td>"+"1"+"</td>");}
else {pout.println("<td>"+"0"+"</td>");}
pout.println("</tr>");
i = i + 1;
}
pout.println("</table></body>");
while ((h =  binF.readLine()) != null) {pout.println(h);}
fin.close();
pout.close();
}
}