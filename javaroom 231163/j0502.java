class aa {
    static String a[][] = new String[2][3];
    public static void aaa() {
    a[0][0] = "101";
    a[0][1] = "102";
    a[0][2] = "103";
    int i = 0;
    a[1][i++] = "tom";  // 1,0
    a[1][i++] = "dang"; // 1,1
    a[1][i++] = "boy";  // 1,2
 }
}

class bb extends aa {
    public static void bbb() {
    aaa();
    
    int sum = 0; 

    for (int x = 0; x < a[0].length; x++) {
    for (int y = 0; y < a.length; y++) { 
    
    System.out.print(a[y][x] + " ");
    if (y==1) {
      sum += Integer.parseInt(a[0][x]);
      System.out.println();    
  }
 }  
}

   System.out.println(sum);
 }
}

class cc extends bb {
   public static void main(String args[]) {
   bbb();
 }
}
  