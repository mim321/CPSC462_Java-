import java.io.*;
import java.lang.*;
import java.util.regex.*;
class nichapatxt { /* 1 - 631108 */  
    public static void main(String args[]) throws IOException {    String waitopt;
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String mim;
    waitopt  = "Wait your choice [menu, bye, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14] : ";
    displaymenu();
    System.out.print(waitopt);
    mim = stdin.readLine();
    while (!mim.equals("0")) {      if (mim.equals("0") || mim.equals("bye")) {        System.out.println("Bye Bye");
          break;
      } else if (mim.equals("1")) {        
        addstu();
        mim = " ";
      } else if (mim.equals("2")) {
        addsubj();
        mim = " ";
      } else if (mim.equals("3")) {
        addreg();
        mim = " ";
      } else if (mim.equals("4")) {
        deletestu();
        mim = " ";
      } else if (mim.equals("5")) {
        deletesubj();
        mim = " ";
      } else if (mim.equals("6")) {
        deletereg();
        mim = " ";
      } else if (mim.equals("7")) {
        editstu();
        mim = " ";
      } else if (mim.equals("8")) {
       	editsub();
       	mim = " ";
      } else if (mim.equals("9")) {
       	editreg();
       	mim = " ";
      } else if (mim.equals("10")) {
        list("student.txt");
        mim = " ";
      } else if (mim.equals("11")) {
        list("subject.txt");
        mim = " ";
      } else if (mim.equals("12")) {
        list("register.txt");
        mim = " ";
      } else if (mim.equals("13")) {
        search();
        mim = " ";
      } else if (mim.equals("14")) {
        list("myprofile.txt");
        mim = " ";
      } else {       
        System.out.print(waitopt);
        mim = stdin.readLine();
        /* mim = (char)System.in.read();
 for 1 character */      }    }  }
 /* 2 */  
    static void displaymenu () {    
    System.out.println("0 : bye bye");
    System.out.println("1 : Add Student");
    System.out.println("2 : Add Subject");
    System.out.println("3 : Add Register");
    System.out.println("4 : Delete Student");
    System.out.println("5 : Delete Subject");
    System.out.println("6 : Delete Register");
    System.out.println("7 : Edit Student");
    System.out.println("8 : Edit Subject");
    System.out.println("9 : Edit Register");
    System.out.println("10 : List Student");
    System.out.println("11 : List Subject");
    System.out.println("12 : List Register");
    System.out.println("13 : Search");
    System.out.println("14 : My Profile");
    System.out.println("");
    }
    /* 3 */  
    public static void addstu () throws IOException {    
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String id, name;
    System.out.print("Student Id : ");
    id = stdin.readLine();
    System.out.print("Student Name : ");
    name = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("student.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b = bin.readLine()) != null) {
        ar[i] = b;
        i = i + 1;
    }
    fin.close();
    int stdin2 = i;
    FileOutputStream fout = new FileOutputStream("student.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < stdin2) {
        pout.println(ar[i]);
        i = i + 1;
    }
    pout.println(id + "," + name);
    System.out.println("Add : completely");
    pout.close();
    }

  /* 4 */  
  public static void addsubj () throws IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      String id,name,credit;
      System.out.print("Subjects Id : ");
      id = stdin.readLine();
      System.out.print("subject Name : ");
      name = stdin.readLine();
      System.out.print("subject Credit : ");
      credit = stdin.readLine();
      String b;
      String ar[] = new String[10];
      FileReader fin = new FileReader("subject.txt");
      BufferedReader bin = new BufferedReader (fin);
      int i = 0;
      while ((b = bin.readLine()) != null) {
          ar[i] = b;
          i = i + 1;
      }
      fin.close();
      int stdin2 = i;
      FileOutputStream fout = new FileOutputStream("subject.txt");
      BufferedOutputStream bout = new BufferedOutputStream(fout);
      PrintStream pout = new PrintStream(bout);
      i = 0;
      while (i < stdin2) {
          pout.println(ar[i]);
          i = i + 1;
      }
      pout.println(id + "," + name + "," + credit);
      System.out.println("Add : completely");
      pout.close();
 }

  /* 5 */  
  public static void addreg () throws IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      String id,name,grade,sec;
      System.out.print("Enter student Id : ");
      id = stdin.readLine();
      System.out.print("Enter subject Id : ");
      name = stdin.readLine();
      System.out.print("Enter grade : ");
      grade = stdin.readLine();
      System.out.print("Enter sec : ");
      sec = stdin.readLine();
      String b;
      String ar[] = new String[10];
      FileReader fin = new FileReader("register.txt");
      BufferedReader bin = new BufferedReader (fin);
      int i = 0;
      while ((b = bin.readLine()) != null) {
          ar[i] = b;
          i = i + 1;
      }
      fin.close();
      int stdin2 = i;
      FileOutputStream fout = new FileOutputStream("register.txt");
      BufferedOutputStream bout = new BufferedOutputStream(fout);
      PrintStream pout = new PrintStream(bout);
      i = 0;
      while (i < stdin2) {
          pout.println(ar[i]);
          i = i + 1;
      }
      pout.println(id + "," + name + "," + grade + "," + sec);
      System.out.println("Add : completely");
      pout.close();
 }

   /* 6 */  
  public static void deletestu () throws IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      String id;
      System.out.print("Student Id : ");
      id = stdin.readLine();
      String b;
      String ar[] = new String[10];
      FileReader fin = new FileReader("student.txt");
      BufferedReader bin = new BufferedReader (fin);
      int i = 0;
      while ((b = bin.readLine()) != null) {
          ar[i] = b;
          i = i + 1;
      }
      fin.close();
      int stdin2 = i;
      FileOutputStream fout = new FileOutputStream("student.txt");
      BufferedOutputStream bout = new BufferedOutputStream(fout);
      PrintStream pout = new PrintStream(bout);
      i = 0;
      while (i < stdin2) {
          if (id.equals(ar[i].substring(0,10))) {
              System.out.println("Delete stuent : completely");
          }
          else {
              pout.println(ar[i]);
          }
          i = i + 1;
      }
      pout.close();
 }
  
  /* 7 */  
  public static void deletesubj () throws IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      String id;
      System.out.print("Subjects Id : ");
      id = stdin.readLine();
      String b;
      String ar[] = new String[10];
      FileReader fin = new FileReader("subject.txt");
      BufferedReader bin = new BufferedReader (fin);
      int i = 0;
      while ((b = bin.readLine()) != null) {
          ar[i] = b;
          i = i + 1;
      }
      fin.close();
      int stdin2 = i;
      FileOutputStream fout = new FileOutputStream("subject.txt");
      BufferedOutputStream bout = new BufferedOutputStream(fout);
      PrintStream pout = new PrintStream(bout);
      i = 0;
      while (i < stdin2) {
          if (id.equals(ar[i].substring(0,2))) {
              System.out.println("Delete subject : completely");
          }
          else {
              pout.println(ar[i]);
          }
          i = i + 1;
      }
      pout.close();
 }
 
  /* 8 */  
  public static void deletereg () throws IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      String id;
      System.out.print("Register Id : ");
      id = stdin.readLine();
      String b;
      String ar[] = new String[10];
      FileReader fin = new FileReader("register.txt");
      BufferedReader bin = new BufferedReader (fin);
      int i = 0;
      while ((b = bin.readLine()) != null) {
          ar[i] = b;
          i = i + 1;
      }
      fin.close();
      int stdin2 = i;
      FileOutputStream fout = new FileOutputStream("register.txt");
      BufferedOutputStream bout = new BufferedOutputStream(fout);
      PrintStream pout = new PrintStream(bout);
      i = 0;
      while (i < stdin2) {
          if (id.equals(ar[i].substring(0,3))) {
              System.out.println("Delete register : completely");
          }
          else {
              pout.println(ar[i]);
          }
          i = i + 1;
      }
      pout.close();
 }

  /* 9 */ 
  public static void editstu () throws IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      String id,name;
      System.out.print("Enter Student Id : ");
      id = stdin.readLine();
      System.out.print("Enter Student name : ");
      name = stdin.readLine();
      String b;
      String ar[] = new String[10];
      FileReader fin = new FileReader("student.txt");
      BufferedReader bin = new BufferedReader (fin);
      int i = 0;
      while ((b = bin.readLine()) != null) {
          ar[i] = b;
          i = i + 1;
      }
      fin.close();
      int stdin2 = i;
      FileOutputStream fout = new FileOutputStream("student.txt");
      BufferedOutputStream bout = new BufferedOutputStream(fout);
      PrintStream pout = new PrintStream(bout);
      i = 0;
      while (i < stdin2) {
          if (id.equals(ar[i].substring(0,10))) {
              pout.println(id + "," + name);
              System.out.println("Enter student : completely");
          }
          else {
              pout.println(ar[i]);
          }
          i = i + 1;
      }
      pout.close();
 }
  
    /* 10 */  
    public static void editsub () throws IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      String id,name,credit;
      System.out.print("Enter Subjects Id : ");
      id = stdin.readLine();
      System.out.print("Enter Subjects name : ");
      name = stdin.readLine();
      System.out.print("Enter Subjects Credit : ");
      credit = stdin.readLine();
      String b;
      String ar[] = new String[10];
      FileReader fin = new FileReader("subject.txt");
      BufferedReader bin = new BufferedReader (fin);
      int i = 0;
      while ((b = bin.readLine()) != null) {
          ar[i] = b;
          i = i + 1;
      }
      fin.close();
      int stdin2 = i;
      FileOutputStream fout = new FileOutputStream("subject.txt");
      BufferedOutputStream bout = new BufferedOutputStream(fout);
      PrintStream pout = new PrintStream(bout);
      i = 0;
      while (i < stdin2) {
          if (id.equals(ar[i].substring(0,2))) {
              pout.println(id + "," + name + "," + credit);
              System.out.println("Enter subject : completely");
          }
          else {
              pout.println(ar[i]);
          }
          i = i + 1;
      }
      pout.close();
 }

/* 11 */  
    public static void editreg () throws IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      String id,name,grade,sec;
      System.out.print("Enter Stuent Id : ");
      id = stdin.readLine();
      System.out.print("Enter Subjects Id : ");
      name = stdin.readLine();
      System.out.print("Enter Grade : ");
      grade = stdin.readLine();
      System.out.print("Enter sec : ");
      sec = stdin.readLine();
      String b;
      String ar[] = new String[10];
      FileReader fin = new FileReader("register.txt");
      BufferedReader bin = new BufferedReader (fin);
      int i = 0;
      while ((b = bin.readLine()) != null) {
          ar[i] = b;
          i = i + 1;
      }
      fin.close();
      int stdin2 = i;
      FileOutputStream fout = new FileOutputStream("register.txt");
      BufferedOutputStream bout = new BufferedOutputStream(fout);
      PrintStream pout = new PrintStream(bout);
      i = 0;
      while (i < stdin2) {
          if (id.equals(ar[i].substring(0,3))) {
              pout.println(id + "," + name + "," + grade + "," + sec);
              System.out.println("Edit : completely");
          }
          else {
              pout.println(ar[i]);
          }
          i = i + 1;
      }
      pout.close();
 }

 /* 12 */ 
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
    
/* 13 */ 
public static void search() throws IOException{
  int found =0;
  char mim;
  String b,g = "";
  String[] fields;
  System.out.print("Enter Student ID : ");
  mim =(char)System.in.read();
  while (mim != 'f'){
    g = g + mim;
    mim = (char)System.in.read();
  }
  FileReader fin = new FileReader("register.txt");
  BufferedReader bin = new BufferedReader(fin);
  while((b=bin.readLine()) != null){
    fields = b.split(",");
    if(fields[0].equals(g)){
      System.out.println("== Register Data ==" + "\n" +
        "Student ID : " + fields[0] + "\n" +
        "Subject ID : " + fields[1] + "\n" +
        "Grade ID : " + fields[2] + "\n" +
        "Sec : " + fields[3]);
      found=1;
    }
  }
  if (found == 0) System.out.println("Not Found");
  fin.close();
}

/* 14 */ 
public static void prof (String f) throws IOException {
    int n = 0;
    byte b[] = new byte[128];
    FileInputStream fin = new FileInputStream(f);
    while ((n = fin.read(b)) != -1){
      for(int i=0;i<n;i++) {
        System.out.print((char)b[i]);
      }
    }
    fin.close();
  }
} 

