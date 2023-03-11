import java.util.Scanner;
import java.util.Random;

class GameMethod {

    //  Making construcer of class-GameMethod
    GameMethod(int user, int comp) {
        if (user == (comp + 1)) {
            System.out.println("Match Draw");
        } else if (user == 1 && comp == 1 || user == 2 && comp == 2 || user == 3 && comp == 0) {
            System.out.println("You win the game!");
        } else {
            System.out.println("You loss the game!");
        }
    }
}

public class RockPaperScissor {
    public static void main(String[] args) {

        // Initialize the game
        System.out.println("Welcome To The Game!!");
        System.out.println();
        System.out.println("Enter 1 for Rock");
        System.out.println("Enter 2 for Scissor");
        System.out.println("Enter 3 for Paper");
        System.out.println();
        
        // Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice:  ");
        int user = sc.nextInt();

        // Taking computer input
        Random rm = new Random();
        int comp = rm.nextInt(2);
        
        // Choice of computer
        if (comp == 0) {
            System.out.println("Computer choose Rock");
        } else if (comp == 1) {
            System.out.println("Computer choose Sciccor");
        } else {
             System.out.println("Computer choose Paper");
        }

        // Making object of class-GameMethod
        GameMethod game = new GameMethod(user, comp);
    }
}
