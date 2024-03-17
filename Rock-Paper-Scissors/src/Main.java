import java.util.Scanner;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors");
        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("How many rounds would you like to play? ");
        int round = scanner.nextInt();
        Game.game(name,round);

    }
}
