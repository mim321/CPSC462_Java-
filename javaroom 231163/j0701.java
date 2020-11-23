import java.io.*;
class j0701 {
  public static void main (String args[]) throws IOException {

    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String getid = stdin.readLine();

    int i = 1;
    int tot = 0;
    String b;
    String[] fields;
    String patternStr = ","; // this var may be removed
    FileReader fin = new FileReader("salary.txt");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      fields = b.split(patternStr);
      if (fields[0].equals(getid)) {
      System.out.println(i + " : " + fields[0]);
      System.out.println("Name : " + fields[1]);
      System.out.println("Surnname : " + fields[2]);
      System.out.println("Salary : " + fields[3]);
      tot = tot + Integer.parseInt(fields[3]);
      i = i + 1;
    }
}
    //System.out.println("Total : " + tot);
    fin.close();
  }
}

