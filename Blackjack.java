import java.util.*;

public class Blackjack {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();

        boolean userQuit = false;
        boolean roundOver;
        int randNum = 0;
        int userHand = 0;
        int userCard = 0;
        int gameRound = 0;
        double menuOption = 1;
        int dealerHand = 0;
        int playerWins = 0;
        int dealerWins = 0;
        int gamesTie = 0;
        int gamesPlayed = 0;
        double playerWinsPerc = 0;


        while (!userQuit) {


            gameRound++;
            System.out.println("START GAME #" + gameRound);
            gamesPlayed++;
            System.out.println();
            roundOver = false;

            while (!roundOver) {

                try {

                    userCard = randGen.nextInt(13) + 1;         // for 1

                    if (menuOption == 1) {

                        if (userCard == 1) {
                            System.out.println("Your card is an ACE!");
                            userHand = userHand + userCard;
                            System.out.println("Your hand is: " + userHand);
                            System.out.println();
                        } else if (userCard == 2) {
                            System.out.println("Your card is a 2!");
                            userHand = userHand + userCard;
                            System.out.println("Your hand is: " + userHand);
                            System.out.println();
                        } else if (userCard == 3) {
                            System.out.println("Your card is a 3!");
                            userHand = userHand + userCard;
                            System.out.println("Your hand is: " + userHand);
                            System.out.println();
                        } else if (userCard == 4) {
                            System.out.println("Your card is a 4!");
                            userHand = userHand + userCard;
                            System.out.println("Your hand is: " + userHand);
                            System.out.println();
                        } else if (userCard == 5) {
                            System.out.println("Your card is a 5!");
                            userHand = userHand + userCard;
                            System.out.println("Your hand is: " + userHand);
                            System.out.println();
                        } else if (userCard == 6) {
                            System.out.println("Your card is 6!");
                            userHand = userHand + userCard;
                            System.out.println("Your hand is: " + userHand);
                            System.out.println();
                        } else if (userCard == 7) {
                            System.out.println("Your card is 7!");
                            userHand = userHand + userCard;
                            System.out.println("Your hand is: " + userHand);
                            System.out.println();
                        } else if (userCard == 8) {
                            System.out.println("Your card is 8!");
                            userHand = userHand + userCard;
                            System.out.println("Your hand is: " + userHand);
                            System.out.println();
                        } else if (userCard == 9) {
                            System.out.println("Your card is 9!");
                            userHand = userHand + userCard;
                            System.out.println("Your hand is: " + userHand);
                            System.out.println();
                        } else if (userCard == 10) {
                            System.out.println("Your card is 10!");
                            userHand = userHand + userCard;
                            System.out.println("Your hand is: " + userHand);
                            System.out.println();
                        } else if (userCard == 11) {
                            System.out.println("Your card is JACK!");
                            userHand = userHand + 10;
                            System.out.println("Your hand is: " + userHand);
                            System.out.println();
                        } else if (userCard == 12) {
                            System.out.println("Your card is QUEEN!");
                            userHand = userHand + 10;
                            System.out.println("Your hand is: " + userHand);
                            System.out.println();
                        } else if (userCard == 13) {
                            System.out.println("Your card is KING!");
                            userHand = userHand + 10;
                            System.out.println("Your hand is: " + userHand);
                            System.out.println();
                        }

                        if (userHand == 21) {
                            System.out.println("BLACKJACK! You win!");
                            System.out.println();
                            userHand = 0;
                            dealerHand = 0;
                            roundOver = true;
                            break;
                        } else if (userHand > 21) {
                            System.out.println("You exceeded 21! You lose :(");
                            System.out.println();
                            userHand = 0;
                            dealerHand = 0;
                            roundOver = true;
                            break;
                        }
                    }

                    // for 2

                    if (menuOption == 2) {

                        dealerHand = randGen.nextInt(11) + 16;
                        System.out.println("Dealer's hand: " + dealerHand);
                        System.out.println("Your hand is: " + userHand);
                        System.out.println();

                        if (dealerHand > 21) {
                            System.out.println();
                            System.out.println("You win!");
                            System.out.println();
                            userHand = 0;
                            dealerHand = 0;
                            playerWins++;
                            menuOption = 1;
                            roundOver = true;
                            break;
                        } else if (dealerHand == userHand) {
                            System.out.println("It's a tie! No one wins!");
                            System.out.println();
                            userHand = 0;
                            dealerHand = 0;
                            gamesTie++;
                            roundOver = true;
                            break;
                        } else if (dealerHand > userHand) {
                            System.out.println("Dealer wins!");
                            System.out.println();
                            userHand = 0;
                            dealerHand = 0;
                            menuOption = 1;
                            dealerWins++;
                            roundOver = true;
                            break;
                        } else if (dealerHand < userHand) {
                            System.out.println();
                            System.out.println("You win!");
                            System.out.println();
                            userHand = 0;
                            dealerHand = 0;
                            menuOption = 1;
                            playerWins++;
                            roundOver = true;
                            break;
                        }
                    }

                    // for 3

                    if (menuOption == 3) {

                        System.out.println("Number of Player wins: " + playerWins);
                        System.out.println("Number of Dealer wins: " + dealerWins);
                        System.out.println("Number of tie games: " + gamesTie);
                        System.out.println("Total # of games played is: " + (gamesPlayed - 1));
                        System.out.println("Percentage of Player wins: " + playerWins * 100.0 / gamesPlayed + "%");
                        System.out.println();

                    }

                    // for 4

                    if (menuOption == 4) {
                        roundOver = true;
                        userQuit = true;
                        System.exit(0);

                    } else if ((Math.round(menuOption) != menuOption) || (menuOption > 4) || (menuOption <= 0)) {
                        System.out.println();
                        System.out.println("Invalid input");
                        System.out.println("Please enter an integer value between 1 and 4.");
                        System.out.println();
                    }
                }
                catch (InputMismatchException e){
                    System.out.println();
                    System.out.println("Invalid input");
                    System.out.println("Please enter an integer value between 1 and 4.");
                    System.out.println();
                }


                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");
                System.out.println();
                System.out.print("Choose an option: ");
                menuOption = scnr.nextDouble();
                System.out.println();

            }

        }
    }
}
