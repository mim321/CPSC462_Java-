import java.applet.*;
import java.awt.*;
public class j1101 extends Applet {
  Image img;
  public void init() {
    setBackground(Color.pink);
    img = getImage(getDocumentBase(),"mim.gif");
  }
    public void paint(Graphics gr)
  {
  gr.setColor(Color.white);
  gr.fillOval(204,405,65,40);
  gr.setColor(Color.black);
  gr.drawOval(204,405,65,40);
  //left leg
  gr.setColor(Color.white);
  gr.fillOval(282,405,65,40);
  gr.setColor(Color.black);
  gr.drawOval(282,405,65,40);
  //right leg
  int x[]={200,350,400,420,348,340,290,275,260,210,218,188,168};
  int y[]={250,250,200,220,300,420,420,380,420,420,310,360,340};
  gr.setColor(Color.blue);
  gr.fillPolygon(x,y,13);
  gr.setColor(Color.blue);
  gr.fillPolygon(x,y,13);
  //body
  gr.setColor(Color.white);
  gr.fillOval(223,240,115,125);
  gr.setColor(Color.black);
  gr.drawOval(223,240,115,125);
  gr.drawLine(240,310,320,310);
  gr.drawArc(240,270,80,80,180,180);
  //head
  gr.setColor(Color.BLUE);
  gr.fillOval(170,85,210,180);
  gr.setColor(Color.black);
  gr.drawOval(170,85,210,180);
  //face
  gr.setColor(Color.WHITE);
  gr.fillOval(188,125,175,135);
  gr.setColor(Color.black);
  gr.drawOval(188,125,175,135);
  //mouth
  gr.setColor(Color.black);
  gr.drawLine(230,198,325,200);
  gr.drawArc(230,155,95,87,180,180);
  gr.setColor(Color.black);
  gr.fillArc(230,155,95,87,180,180);
  //tongue
  gr.setColor(Color.black);
  gr.drawArc(255,214,50,40,-170,-170);
  gr.setColor(Color.red);
  gr.fillArc(255,214,50,40,-170,-190);
  gr.fillArc(255,227,48,15,180,180);
  //left eye
  gr.setColor(Color.white);
  gr.fillOval(232,100,45,60);
  gr.setColor(Color.black);
  gr.drawOval(232,100,45,60);
  //right eye
  gr.setColor(Color.white);
  gr.fillOval(278,100,45,60);
  gr.setColor(Color.black);
  gr.drawOval(278,100,45,60);
  //left pupil
  gr.setColor(Color.black);
  gr.fillOval(255,125,14,24);
  //right pupil
   gr.setColor(Color.black);
   gr.fillOval(285,125,14,24);
   //left inner eye part
   gr.setColor(Color.white);
   gr.fillOval(259,135,7,7);
   //right inner eye part
   gr.setColor(Color.white);
   gr.fillOval(288,135,7,7);  
   //nose
   gr.setColor(Color.red);
   gr.fillOval(260,148,34,34);
   gr.setColor(Color.black);
   gr.drawOval(260,148,34,34);
   //nose inner
   gr.setColor(Color.white);
   gr.fillOval(265,158,10,10);
   gr.setColor(Color.black);
   gr.drawOval(265,158,10,10);
   //moustache line
   gr.drawLine(278,181,278,198);
   gr.drawLine(310,170,368,150);
   gr.drawLine(310,180,368,180);
   gr.drawLine(310,190,368,210);
   gr.drawLine(240,170,188,150);
   gr.drawLine(240,180,188,180);
   gr.drawLine(240,190,188,210);
   //necklace
   gr.setColor(Color.red);
   gr.fillRect(215,248,120,15);
   //
   gr.setColor(Color.black);
   //
   gr.drawRect(215,248,120,15);
   //bell
   gr.setColor(Color.yellow);
   gr.fillOval(260,250,40,40);
   gr.setColor(Color.black);
   gr.drawOval(260,250,40,40);

   //bell inner part
   gr.setColor(Color.black);
   gr.fillOval(274,270,10,10);
   gr.setColor(Color.black);
   
   // bell lines
   gr.drawArc(253,265,50,20,30,100);
   
   //left hand
   gr.setColor(Color.white);
   gr.fillOval(158,330,40,40);
   gr.setColor(Color.black);
   gr.drawOval(158,330,40,40);

   //right hand
   gr.setColor(Color.white);
   gr.fillOval(390,190,40,40);
   gr.setColor(Color.black);
   gr.drawOval(390,190,40,40);
   gr.drawImage(img, 17, 200, this);
 }
}