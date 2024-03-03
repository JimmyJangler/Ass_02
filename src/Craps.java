import java.util.Random;
import java.util.Scanner;

public class Craps
{
    public static void main(String[] args) {
        //variable declarations + random util + scanner util
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int die1, die2, crapsRoll, point, die3, die4, pointRoll;
        boolean done = false;
        boolean finished = false;
        String gameContinue = "";
        String crapsWin = "";


        //do while loop for main game loop
        while (!done) {
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            finished = false;

            crapsRoll = die1 + die2;
            point = 0;

            System.out.println("Rolling dice.... Result: ");
            System.out.println("|Die 1  | Die 2  | Craps Roll | Win?  |");
            System.out.println("|-------|--------|------------|-------|");
            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                crapsWin = "L";
                System.out.println("|   " + die1 + "   |   " + die2 + "    |     " + crapsRoll + "      |   " + crapsWin + "   |");
                System.out.println("Craps.... You Lose!");
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                crapsWin = "W";
                System.out.println("|   " + die1 + "   |   " + die2 + "    |     " + crapsRoll + "      |   " + crapsWin + "   |");
                System.out.println("Natural! You Win!");
            } else {
                crapsWin = "";
                System.out.println("|   " + die1 + "   |   " + die2 + "    |     " + crapsRoll + "      |    " + crapsWin + "   |");
                point = crapsRoll;
                System.out.println("Point is set to: " + point);
                while (!finished) {
                    System.out.println("Re-Rolling......");
                    die3 = rnd.nextInt(6) + 1;
                    die4 = rnd.nextInt(6) + 1;
                    pointRoll = die3 + die4;
                    if (pointRoll == 7) {
                        System.out.println("You rolled a 7! You lose!");
                        finished = true;
                    } else if (pointRoll == point) {
                        System.out.println("You rolled the point! You win!");
                        finished = true;
                    }
                }
            }
                System.out.print("Would you like to continue playing? [Y/N]:");
                gameContinue = in.nextLine();
                if (gameContinue.equalsIgnoreCase("N")) {
                    done = true;
                }

            System.out.print("Thanks for playing!");


        }
    }
}