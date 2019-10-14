package FB;

import java.util.Scanner;

public class FizzBuzz
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Maximum of range (2 minimum): ");
        String string=input.next();
        int n1=Integer.parseInt(string);
        FizzBuzz(n1);
    }

    public static void FizzBuzz(int num) {
        int i;

        for (i = 1; i <= num; i++) {
            if (i % 15 == 0)
            {
                System.out.print("FizzBuzz ");
            }
            else if(i%5==0)
            {
                System.out.print("Buzz ");
            }
            else if(i%3==0)
            {
                System.out.print("Fizz ");
            }
            else {
                System.out.print(i+" ");
            }
        }
    }
}
