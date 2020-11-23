// program id : 21
// try on c:/windows/win.ini 
import java.io.*;
public class j0601 {
  public static void main (String args[]) throws IOException {
    
    File file = new File("x.txt");
    boolean success = file.createNewFile(); // 0 byte

     File file1 = new File1("x1.txt");
    boolean success1 = file.createNewFile(); // 0 byte    

    // move hello1.txt to y.txt
    File file2 = new File("y.txt");

        // move hello1.txt to y.txt
    File file3 = new File1("z.txt");

    success = file.renameTo(file2);
    // move hello2.txt to d:/y.txt
    File b = new File("d:/");


    success = file2.renameTo(new File(b, file2.getName()));

    // if(!found) then can not delete & success = false
    success = (new File("y.txt")).delete();
    System.out.println("Delete y.txt : " + success); // false

    // if (found) then delete & success = true
    success = (new File("d:/y.txt")).delete();
    System.out.println("Delete d:/y.txt : " + success); // true
  }
}