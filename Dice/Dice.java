package Dice;

public class Dice {
   private double die1, die2;

   public Dice(){
        die1 = 1;
        die2 = 2;
   }

   public void roll(){
       die1 = Math.random(1, 6);
       die2 = Math.random(1, 6);
   }

   public int getTotal(){
       sum = die1 + die2;
   }
    
}
