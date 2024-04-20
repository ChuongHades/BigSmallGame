import java.util.Random;

public class Dice {
    private int value;

    public Dice() {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void roll(){
        Random randomDice = new Random();
        this.value = randomDice.nextInt(6)+1;
    }
}
