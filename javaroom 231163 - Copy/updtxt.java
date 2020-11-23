import java.io.*;
import java.lang.*;
import java.util.regex.*;
class updtxt { 
/* 1 - 631108 */
  public static void main(String args[]) throws IOException {
    String waitopt;
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));    
    String buf; 
    waitopt  = "Wait your choice [menu, bye, 0, 1, 2, 3, 4, 5, 6, 7, 8] : ";
    displaymenu();
    System.out.print(waitopt);
    buf = stdin.readLine();
    while (!buf.equals("0")) {
      if (buf.equals("0") || buf.equals("bye")) {
        System.out.println("Bye Bye");  
        break;
      } else if (buf.equals("1")) {
        create5();
        buf = " ";
      } else if (buf.equals("2") || buf.equals("l")) {
        list("updtxt.dat");
        buf = " ";
      } else if (buf.equals("3")) {
        listnum();
        buf = " ";
      } else if (buf.equals("4")) {
        converttohtm();
        buf = " ";
      } else if (buf.equals("5") || buf.equals("e")) {
        editnamesalary();
        buf = " ";
      } else if (buf.equals("6") || buf.equals("d")) {
        deleteonid();
        buf = " ";
      } else if (buf.equals("7") || buf.equals("a")) {
        addnew();
        buf = " ";
      } else if (buf.equals("8") || buf.equals("s")) {
        totalsalary();
        buf = " ";
      } else if (buf.equals("menu") || buf.equals("m")) {
        displaymenu();
        buf = " ";
      } else {
        System.out.print(waitopt);
        buf = stdin.readLine();
        /* buf = (char)System.in.read(); for 1 character */
      }
    }
  }
/* 2 */
  static void displaymenu () {
    System.out.println("o : bye bye");
    System.out.println("1 : Create 3 fields, 5 records for updtxt.dat");
    System.out.println("2 : List all records");
    System.out.println("3 : List with line numbers");
    System.out.println("4 : Convert updtxt.dat to updtxt.htm");
    System.out.println("5 : Edit name, salary on id");
    System.out.println("6 : Delete on id");
    System.out.println("7 : Add new record");
    System.out.println("8 : Total salary");
    System.out.println("");  
  }
/* 3 */
  public static void create5 () throws IOException {
    FileOutputStream fout = new FileOutputStream("updtxt.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    pout.println("101,Mr.Koanchanok Narittom,2500");
    pout.println("102,Ms.Kyle Burin,10000");
    pout.println("103,Ms.Sala Romeo,55000");
    pout.println("104,Mr.Jib Jibjib,1000");
    pout.println("105,Ms.Maya Noar,3500");
    System.out.println("Create 5 records : completely");
    pout.close();
  }
/* 4 */
  public static void list (String f) throws IOException {
    int n = 0;
    byte b[] = new byte[128];
    FileInputStream fin = new FileInputStream(f);
    while ((n = fin.read(b)) != -1) {
      for(int i=0;i<n;i++) {
        System.out.print((char)b[i]);
      }
    }
    fin.close();
  }
/* 5 */
  public static void listnum () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String buf;
    System.out.print("Wait filename to listing : ");
    buf = stdin.readLine();
    int n = 0;
    int l = 1;
    byte b[] = new byte[125];
    FileInputStream fin = new FileInputStream(buf);
    System.out.print(l + " : "); 
    l = l + 1;
    while ((n = fin.read(b)) != -1) {
      for(int i=0;i<n;i++) {
        if (b[i] != 13) {  
          if (b[i] == 10) {
             System.out.println(); 
             System.out.print(l + " : "); 
             l = l + 1;
          } else System.out.print((char)b[i]);
        }  
      }
    }
    fin.close();
    System.out.println();
    System.out.println("===================================")
  }
/* 6 */
  public static void converttohtm () throws IOException {
    int i = 1;
    String b;    
    FileReader fin = new FileReader("updtxt.dat");
    BufferedReader bin = new BufferedReader (fin);
    /* in j0605.java will use character */
    FileOutputStream fout = new FileOutputStream("updtxt.htm");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    pout.println("<style type='text/css'>");
    pout.println("td{font-family:fixedsys;font-size:10px;}");
    pout.println("</style>");
    pout.println("<body bgcolor=gray><table border=0 cellspacing=1 width=100%  bgcolor=#ffffdd>");
    while ((b =  bin.readLine()) != null) {
      /* String bnew = b.replace('a', 'A'); */
      Pattern pattern = Pattern.compile("&");
      Matcher matcher = pattern.matcher(b);
      b = matcher.replaceAll("&#38;");
      pattern = Pattern.compile(">");
      matcher = pattern.matcher(b);
      b = matcher.replaceAll("&gt;");
      /* - */
      pattern = Pattern.compile("<");
      matcher = pattern.matcher(b);
      b = matcher.replaceAll("&lt;");
      /* - */
      pattern = Pattern.compile(" ");
      matcher = pattern.matcher(b);
      b = matcher.replaceAll("&nbsp;");
      /* - */
      pout.println("<tr>");
      pout.println("<td>"+i+"</td>");
      pout.println("<td>"+b+"</td>");
      pout.println("</tr>");
      i = i + 1;
    }
    pout.println("</table></body>");
    fin.close();
    pout.close();
    System.out.println("Use IE to open updtxt.htm");
  }
  /* 7 */
  public static void editnamesalary () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid,bufname,bufsalary;
    System.out.print("Wait id : ");
    bufid = stdin.readLine();
    System.out.print("Wait name : ");
    bufname = stdin.readLine();
    System.out.print("Wait salary : ");
    bufsalary = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("updtxt.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int tot = i;
    FileOutputStream fout = new FileOutputStream("updtxt.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (bufid.equals(ar[i].substring(0,3))) {
        pout.println(bufid + "," + bufname + "," + bufsalary);
        System.out.println("Edit : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  /* 8 */
  public static void deleteonid () throws IOException {
    Bufferedreader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid;
    System.out.print("Wait id : ");
    bufid = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("updtxt.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int tot = i;
    FileOutputStream fout = new FileOutputStream("updtxt.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (bufid.equals(ar[i].substring(0,3))) {
        System.out.println("Delete : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  /* 9 */
  public static void addnew () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid,bufname,bufsalary;
    System.out.print("Wait id : ");
    bufid = stdin.readLine();
    System.out.print("Wait name : ");
    bufname = stdin.readLine();
    System.out.print("Wait salary : ");
    bufsalary = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("updtxt.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while (b =  bin.readLine() != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int tot = i;
    FileOutputStream fout = new FileOutputStream("updtxt.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      pout.println(ar[i]);     
      i = i + 1;
    }
    pout.println(bufid + "," + bufname + "," + bufsalary);
    System.out.println("Add : completely");
    pout.close();
  }
  /* 10 */
  public static void totalsalary () throws IOException {
    String b,fld[];
    FileReader fin = new FileReader("uptxt.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0,total = 0;
    while ((b =  bin.readLine()) != null) {      
       fld = b.split(",");	
       total = total + Integer.parseInt(fld[2]);
       i = i + 1;
    }    
    fin.close();
    System.out.println("Total salary = " + total);
  }
}