import javax.swing.*;
import java.awt.*;

public class DiceView extends JPanel
{private Die obj; 
 private int x,y,size,diff;
 private int number1=1;
 private int number2=2;
 
 public DiceView(Die die, String title,int x,int y,int size,int diff)
 {obj=die;
  this.x=x;
  this.y=y;
  this.size=size;
  this.diff=diff;
  JFrame frame= new JFrame();
  frame.setSize(500,500);
  frame.setTitle(title);
  frame.setVisible(true);
  frame.getContentPane().add(this);
 }
 
 public void paintComponent(Graphics g)
 { g.setColor(Color.white);
   g.fillRect(0,0,500,500);
   g.setColor(Color.black);
   obj.getFace(g,x,y,number1,size,0);
   obj.getFace(g,x,y,number2,size,size+diff);
 }
 
 public void setNumbers(int i,int j)
 {number1=i;
  number2=j;
 }
 

 
 }

