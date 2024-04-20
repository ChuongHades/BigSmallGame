public class House {
    private byte MIN_SMALL;
    private byte MAX_SMALL;
    private byte MIN_BIG;
    private byte MAX_BIG;
    private int wallet;
    private Dice[] dices ;

    public House(int wallet) {
        this.MIN_SMALL = 4;
        this.MAX_SMALL = 10;
        this.MIN_BIG = 11;
        this.MAX_BIG = 17;
        this.wallet = wallet;
        this.dices = dices;
    }

    public void rollDices(){
        dices = new Dice[3];
        for (int i = 0; i < dices.length; i++) {
            dices[i] = new Dice() ;
            dices[i].roll();
        }
    }

    public void printDices(){
        System.out.print("The dices are: ");
        for (int i = 0; i < dices.length; i++){
            System.out.print(" "+dices[i].getValue());
        }
        System.out.println();
    }

    public int sumDices(){
        int sum = 0;
        for(int i = 0; i < dices.length; i++){
            sum = sum + dices[i].getValue();
        }
        return sum;
    }

    public Dice[] getDices() {
        return dices;
    }

    public String checkDiceResult(){
        if (sumDices() >= 3 && sumDices() <= 18){
            for (int i = 0 ; i < dices.length; i++){
                if (dices[0].getValue() == dices[1].getValue() && dices[0].getValue() == dices[2].getValue())
                    return "Same";
            }
        }
            if (this.MIN_SMALL <= sumDices() && sumDices() <= this.MAX_SMALL) {
                return "Small";
            } else if (this.MIN_BIG <= sumDices() && sumDices() <= this.MAX_BIG) {
                return "Big";
            }
        return "";
    }

    public int getWallet() {
        return wallet;
    }

    public void addWallet(int amount){
        this.wallet += amount;
    }
}
