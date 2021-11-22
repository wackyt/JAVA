import java.util.Scanner;

public class Main
{
    // Task 4
    static int CountNumbers(int currentNumber, int maxNumber, int d, int count)
    {
        if (currentNumber == maxNumber) return count;

        int sum = 0;
        int number = currentNumber;
        while (number != 0)
        {
            sum += number % 10;
            number /= 10;
        }

        if (sum == d) count++;

        return CountNumbers(currentNumber + 1, maxNumber, d, count);
    }

    static int CountDigitsSum(int number)
    {
        if (number == 0) return 0;
        return number % 10 + CountDigitsSum(number / 10);
    }

    public static boolean IsPrime(int n, int i)
    {
        if (n < 2)
        {
            return false;
        }
        else if (n == 2)
        {
            return true;
        }
        else if (n % i == 0)
        {
            return false;
        }
        else if (i < n / 2)
        {
            return IsPrime(n, i + 1);
        }
        else
        {
            return true;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Count numbers with digits sum equal d");
        int k, d;
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        d = scanner.nextInt();

        System.out.println(CountNumbers((int)Math.pow(10, k - 1), (int)Math.pow(10, k), d, 0));

        System.out.println("Count digits sum");
        int number;
        number = scanner.nextInt();
        System.out.println(CountDigitsSum(number));

        System.out.println("Is prime number");
        number = scanner.nextInt();
        if (IsPrime(number, 2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
