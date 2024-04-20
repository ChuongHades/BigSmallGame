public class Player {
    private String choice;
    private int bet;
    private int wallet;

    public String getChoice() {
        return choice;
    }
    public void setChoice(String choice) {
        this.choice = choice;
    }
    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public int getWallet() {
        return wallet;
    }
    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
    public Player(int wallet) {
        this.choice = choice;
        this.bet = bet;
        this.wallet = wallet;
    }
    public void addWallet(int amount){
        this.wallet += amount;
    }
}
