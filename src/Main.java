import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int i = 0;
        System.out.println("Welcome to Rock, Paper & Scissors!");
        System.out.println("Rock --> 1");
        System.out.println("Paper --> 2");
        System.out.println("Scissors --> 3");
        int playerWins = 0;
        int compWins = 0;
        while (i != 5) {
            int comp = ran.nextInt(3)+1;
            byte player = sc.nextByte();
            System.out.println("player input: "+player+", Computer input: "+comp);

            if (comp == player) {
                System.out.println("It's a tie! Play again.");
            }
            else if (player == 2 && comp == 1 || player == 1 && comp == 3 || player == 3 && comp == 2) {
                System.out.println("You win the round!");
                playerWins += 1;

            }
            else if(player>=4) {
                System.out.println("Please enter a value between 1-3");
            } else {
                System.out.println("Computer wins the round!");
                compWins += 1;
            }
            i++;
        }
        if(playerWins>compWins) {
            System.out.print("You won the game in best of 5!");
        } else if (compWins>playerWins){
            System.out.println("Computer won the game in best of 5!");
        } else {
            System.out.println("Draw.");
        }
    }
}