//j0404b เรียก subx  จาก extends

class sub02d {
  void subx() {
    System.out.println("subx in sub02d");
  }
}
 class j0404d extends sub02d {
  public static void main(String args[]) {
    j0404d y = new j0404d();  
    y.subx();
  }
}