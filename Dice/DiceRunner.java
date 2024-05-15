package Dice;

public class DiceRunner {
    public static void main(String[] args){
        Dice Seb = new Dice();
        Seb.roll();
        int n = Seb.getTotal();
        System.out.println(Seb);

        Seb.roll();
        n = Seb.getTotal();
        System.out.println(Seb);
    }
    
}
