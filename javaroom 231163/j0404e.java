//j0404e เรียก subx  จาก overriding


 class sub02e {
  void subx() {
    System.out.println("subx in sub02e");
  }
}
class j0404e extends sub02e {
  j0404e() { 
  }
  public static void main(String args[]) {   
    j0404e y = new j0404e();
    y.subx();      
  }
}