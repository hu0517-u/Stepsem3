import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        System.out.print("Enter your move: ");
        String player = sc.nextLine();

        String computer = moves[r.nextInt(3)];
        System.out.println("Computer Move: " + computer);

        if (player.equalsIgnoreCase(computer))
            System.out.println("Draw");
        else if ((player.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
                 (player.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
                 (player.equalsIgnoreCase("Scissors") && computer.equals("Paper")))
            System.out.println("Player Wins");
        else
            System.out.println("Computer Wins");
    }
}
