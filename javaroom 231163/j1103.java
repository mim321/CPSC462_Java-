import java.applet.*;
import java.awt.*;
public class j1103 extends Applet implements Runnable{
  Thread timer;      
  int row = 10;
  public void paint(Graphics g) {
    row = row + 2;
    g.drawLine(5,row,30,row);
  }
  public void start() {
    timer = new Thread(this);
    timer.start(); // start clock
  }
  public void run() {
    Thread me = Thread.currentThread();
    while (timer == me) {
      try {   
        // try required for sleep (1000 = 1 Second)
        Thread.currentThread().sleep(1000);
      } catch (InterruptedException e) { }
      repaint();
    }
  } 
}