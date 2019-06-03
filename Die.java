import java.awt.*;

public class Die
{


 public void paint1(Graphics pen,int x,int y,int size)
 {pen.setColor(Color.black);
  pen.drawRect(x,y,size,size);
  pen.fillOval(x+size/2,y+size/2,5,5);
 }

 public void paint5(Graphics pen,int x,int y,int size)
 {pen.setColor(Color.black);
  pen.drawRect(x,y,size,size);
  pen.fillOval(x+size/2,y+size/2,5,5);
  pen.fillOval(x+size/4,y+size/4,5,5);
  pen.fillOval(x+3*size/4,y+size/4,5,5);
  pen.fillOval(x+size/4,y+3*size/4,5,5);
  pen.fillOval(x+3*size/4,y+3*size/4,5,5);
 }

public void paint4(Graphics pen,int x,int y,int size)
 {pen.setColor(Color.black);
  pen.drawRect(x,y,size,size);
  pen.fillOval(x+size/4,y+size/4,5,5);
  pen.fillOval(x+3*size/4,y+size/4,5,5);
  pen.fillOval(x+size/4,y+3*size/4,5,5);
  pen.fillOval(x+3*size/4,y+3*size/4,5,5);
 }
 
 public void paint3(Graphics pen,int x,int y,int size)
 {pen.setColor(Color.black);
  pen.drawRect(x,y,size,size);
  pen.fillOval(x+size/2,y+size/2,5,5);
  pen.fillOval(x+3*size/4,y+size/4,5,5);
  pen.fillOval(x+size/4,y+3*size/4,5,5);
 }
 
 public void paint2(Graphics pen,int x,int y,int size)
 {pen.setColor(Color.black);
  pen.drawRect(x,y,size,size);
  pen.fillOval(x+3*size/4,y+size/4,5,5);
  pen.fillOval(x+size/4,y+3*size/4,5,5);
 }
 
 public void paint6(Graphics pen,int x,int y,int size)
 {pen.setColor(Color.black);
  pen.drawRect(x,y,size,size);
  pen.fillOval(x+size/4,y+size/4,5,5);
  pen.fillOval(x+3*size/4,y+size/4,5,5);
  pen.fillOval(x+size/4,y+3*size/4,5,5);
  pen.fillOval(x+3*size/4,y+3*size/4,5,5);
  pen.fillOval(x+2*size/4,y+size/4,5,5);
  pen.fillOval(x+2*size/4,y+3*size/4,5,5);
 }
 
 public void getFace(Graphics pen,int x,int y,int number,int size,int diff)
 {
 switch(number)
 {
 case 1 :this.paint1(pen, x+diff, y, size);
         break;
 case 2 :this.paint2(pen, x+diff, y, size);
         break;
 case 3 :this.paint3(pen, x+diff, y, size);
         break;               
 case 4 :this.paint4(pen, x+diff, y, size);
         break;
 case 5 :this.paint5(pen, x+diff, y, size);
         break;
 case 6 :this.paint6(pen, x+diff, y, size);
         break;     
 default :break;                    
 } 
 }
}
