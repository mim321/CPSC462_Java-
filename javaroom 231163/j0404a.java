//j0404a เรียก subx  จาก sub02a

class sub02a {
  void subx() {
    System.out.println("subx in sub02a");
  }
}
 class j0404a {
 public static void main(String args[]) {
    sub02a x = new sub02a();
    x.subx();       
  }
}
