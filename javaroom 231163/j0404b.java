//j0404b เรียก subx  จาก sub01a

class sub01b {
  void subx() {
    System.out.println("subx in sub01b");
  }
}
 class j0404b {
 public static void main(String args[]) {
    sub01b x = new sub01b();
    x.subx();       
  }
}
