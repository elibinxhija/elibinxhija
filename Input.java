import javax.swing.JOptionPane;

public class Input
{private JOptionPane j=new JOptionPane();

 public boolean getAnswer(String s)
 {String ans= j.showInputDialog(s);
  if(ans.toLowerCase().trim().equals("yes")){return true;}
  if(ans.toLowerCase().trim().equals("no")){return false;}
 else
    {j.showMessageDialog(null,"Input error (yes taken as default) ");}
     return true;
 }

}