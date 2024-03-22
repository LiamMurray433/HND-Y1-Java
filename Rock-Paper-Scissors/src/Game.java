import java.util.Scanner;
import java.util.Random;

public class Game {


    static int playerPick, cpuPick;
    static int playerScore, cpuScore;




    public static void game(String name, int round){

        for(int i = 1; i <= round; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please pick a weapon " + name);
            System.out.println("Rock = 1");
            System.out.println("Paper = 2");
            System.out.println("Scissors = 3");
            playerPick = scanner.nextInt();

            Random generator = new Random();
            cpuPick = generator.nextInt(1,3);
            System.out.println("CPU Picks: " + cpuPick);

            if (playerPick == 1 && cpuPick == 1) {
                System.out.println("DRAW :/");
            } else if (playerPick == 1 && cpuPick == 2) {
                System.out.println("YOU LOSE! :(");
                cpuScore++;
            } else if (playerPick == 1 && cpuPick == 3) {
                System.out.println("YOU WIN! :)");
                playerScore++;
            } else if (playerPick == 2 && cpuPick == 1) {
                System.out.println("YOU WIN! :)");
                playerScore++;
            } else if (playerPick == 2 && cpuPick == 2) {
                System.out.println("DRAW :/");
            } else if (playerPick == 2 && cpuPick == 3) {
                System.out.println("YOU LOSE! :(");
                cpuScore++;
            } else if (playerPick == 3 && cpuPick == 1) {
                System.out.println("YOU LOSE! :(");
                cpuScore++;
            } else if (playerPick == 3 && cpuPick == 2) {
                System.out.println("YOU WIN! :)");
                playerScore++;
            } else if (playerPick == 3 && cpuPick == 3) {
                System.out.println("DRAW :/");
            } else {
                System.out.println("Invalid choice!");
            }
            System.out.println("Score: " + "CPU: " + cpuScore + " - " + name + ": " + playerScore);
        }

        if(playerScore > cpuScore){
            System.out.println(" =====================");
            System.out.println("GAME OVER");
            System.out.println(name + " WINS!!");
        }
        else if(cpuScore > playerScore){
            System.out.println(" =====================");
            System.out.println("GAME OVER");
            System.out.println("CPU WINS");
        }
        else{
            System.out.println(" =====================");
            System.out.println("GAME OVER");
            System.out.println("DRAW");
        }
    }
}

