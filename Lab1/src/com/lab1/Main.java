package com.lab1;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main
{
    public static int Factorial(int n)
    {
        int res = 1;
        for (int i = n; i > 1; i--)
            res *= i;
        return res;
    }

    public static void main(String[] args)
    {
        /// Task 1
        {
            System.out.println("Task 1");
            int size = 5;
            int[] array = new int[size];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < size; i++)
                array[i] = sc.nextInt();

            int sum = 0;
            // with for
            for (int i = 0; i < size; i++)
                sum += array[i];
            System.out.println(sum);
            sum = 0;
            // with while
            int i = 0;
            while (i < size)
            {
                sum += array[i];
                i++;
            }
            System.out.println(sum);
            sum = 0;
            i = size - 1;
            // with do while
            do
            {
                sum += array[i];
            } while (i-- > 0);
            System.out.println(sum);
        }

        /// Task 2
        {
            System.out.println("Task 2");
            for (String arg : args)
                System.out.println(arg);
        }

        /// Task 3
        {
            System.out.println("Task 3");
            for (float i = 1.0f; i < 10.0f; i += 1.0f)
            {
                System.out.print(1.0f / i);
                System.out.print(" ");
            }
            System.out.println();
        }

        /// Task 4
        {
            System.out.println("Task 4");
            int size = 5;
            int[] array = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++)
                array[i] = random.nextInt() % 100;
            System.out.println(Arrays.toString(array));
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
        }

        /// Task 5
        {
            System.out.println("Task 5");
            System.out.println("5!: " + Factorial(5));
        }
    }
}
