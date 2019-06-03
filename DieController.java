public class DieController
{private Die die=new Die();
 private DiceView diceV=new DiceView(die,"Dice",50,50,150,50);
 private Input in=new Input();
 private int num1=4;
 private int num2=3; 
 
 
 
 public void rollDice()
 {rollDiceFirst();
  rollDiceAgain();
 }
 
 
 
 public void rollDiceFirst()
 {if(in.getAnswer("Do you wanna throw dice")){throwDice();
                                              diceV.setNumbers(num1,num2);
                                              diceV.repaint();}
 }
 
 public void rollDiceAgain()
 {if(in.getAnswer("Do you wanna throw dice again")){throwDice();
                                                    diceV.setNumbers(num1,num2);
                                                    diceV.repaint();
                                                    rollDiceAgain();}
  else{}
 }
 
 
 public void throwDice()
 {num1 = (int)(Math.random()*6)+1;
  num2 = (int)(Math.random()*6)+1;
 }
 
  
 
 
}