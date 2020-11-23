//j0404c เรียก this  จาก super


class sub02c {
  void subx() {
    System.out.println("subx in sub02c");
  }
}
class j0404c extends sub02c {
  j0404c() { 
    super.subx(); // subx in sub02
    this.subx(); // subx in main
  }
  public static void main(String args[]) {
    j0404c y = new j0404c();    
  }
  void subx() {
    System.out.println("subx in main");
  }
}