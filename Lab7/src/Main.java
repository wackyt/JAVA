import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String firstPlayer, secondPlayer;
        Scanner sc = new Scanner(System.in);
        firstPlayer = sc.nextLine();
        secondPlayer = sc.nextLine();
        Game game = new Game(firstPlayer, secondPlayer);
        System.out.println(game.Play());
    }
}
