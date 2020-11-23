class aa {

    static String x[] = {"mim","wiw","nueng","nick","black"};    
    static String y[] = new String[x.length];  
    public static void aaa() {
    for (int i = 0; i < x.length; i++) {y[i] = "Mr." + x[i];} 
 }
}

class bb extends aa {
    public static void bbb() {
    aaa();
    for (int i = 0; i < x.length; i++) {System.out.println (y[i]);}
 
 }
}


class cc extends bb {
   public static void main(String args[]) {
   bbb();
 }
}
  
 

