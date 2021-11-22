import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(0, 0, 0, 5);
        System.out.println("Initial circle stats");
        circle.PrintStats();
        System.out.println("Enter new circle params x y z r");
        Scanner scanner = new Scanner(System.in);
        circle.SetX(scanner.nextFloat());
        circle.SetY(scanner.nextFloat());
        circle.SetZ(scanner.nextFloat());
        circle.SetRadius(scanner.nextFloat());
        System.out.println("New circle stats");
        circle.PrintStats();
    }
}
