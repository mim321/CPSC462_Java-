import java.io.*;

class a {
   int x;
   int y;
   int z;
   void myget() throws IOException {
    BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
    x = Integer.parseInt(stdin.readLine());
    y = Integer.parseInt(stdin.readLine());
    z = Integer.parseInt(stdin.readLine());
  }
}

class b extends a {
  static int c(int c1, int c2) { return (c1 + c2); }
  static int c(int c1, int c2, int c3) { return (c1 * c2 * c3); }
  public static void main(String args[]) throws IOException { 
    b me = new b();
    me.myget();
    System.out.println(c(me.x,me.y)); 
    System.out.println(c(me.x,me.y,me.z)); 
  }
}