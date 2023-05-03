package org.example.Dice;

public class Player {

    private Dice dice;
    private int minNumberToWin;

    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    public boolean Play(){
        int diceNumber = dice.Roll();
        return diceNumber > minNumberToWin;
    }
}
