public class j0402 {
  public static void main(String args[]) {
  double x = Double.parseDouble(args[0]);
  double y = Double.parseDouble(args[1]);
  double s = 0;
    s += m1(x,y);
    s += m2(x,y);
    s += m3(x,y);
    s += m4(x,y);
    System.out.println(s);
  }
  public static double m1(double x, double y ) { 
    return (x + y);    
  }
  public static double m2(double x, double y ) { 
    return (x - y);    
  }
  public static double m3(double x, double y ) { 
    return (x * y);    
  }
  public static double m4(double x, double y ) { 
    return (x / y);    
 }
}