import java.util.Scanner;

public class BigSmallGame {
    public static void main(String[] args) {
    //money at the beginning
        House house = new House(3000);
        System.out.println("The House has: $" + house.getWallet());

        Player player = new Player(3000);
        System.out.println("The Player has: $" + player.getWallet());
        System.out.println("Try your luck to win all money of the House!");

        Scanner input = new Scanner(System.in);

        String continue_stop = "true";
        String tempFalse ="false";

        int round = 0;

        do {
            if (continue_stop.equalsIgnoreCase(continue_stop)) {
               //number of rounds
                round++;
                System.out.println("Round "+ round);

                //Big or Small
                System.out.println("Do you want to get Big or Small? (Big/ Small) ");
                String yourChoice = input.next();

                //bet
                System.out.println("How much do you want to bet? ");
                int bet;
                do {
                    bet = input.nextInt();
                    if (bet <= player.getWallet()) {
                        player.setBet(bet);
                    } else System.out.println("Your bet is more than what in your wallet! Try again!");
                }
                while (bet > player.getWallet());
                System.out.println("You have bet $" + bet);

                //roll the dices
                house.rollDices();
                house.printDices();
                System.out.println("the sum of 3 dices is: " + house.sumDices()+"!");

                //money in the wallet after play
                if (yourChoice.equalsIgnoreCase(house.checkDiceResult())) {
                    System.out.println("You won $"+bet);
                    player.addWallet(bet);
                    house.addWallet(-bet);
                } else {
                    System.out.println("You lose $"+bet);
                    player.addWallet(-bet);
                    house.addWallet(bet);
                }
                System.out.println("The House has: $" + house.getWallet());
                System.out.println("The Player has: $" + player.getWallet());

                if (player.getWallet() == 0){
                    System.out.println("You are out of money! Bye!");
                    break;
                }

                //play more or stop?
                System.out.println("Do you want to continue to play? (true/false)");
                continue_stop = input.next();
            }
            System.out.println();
        }
        while (!continue_stop.equalsIgnoreCase(tempFalse));

    }
}

