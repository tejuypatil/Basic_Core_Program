package Com.bridgelabz.basic.core;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a = s.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = s.nextInt();
        System.out.println("Enter the 3rd number:");
        int c = s.nextInt();
        if (a > b)
        {
            // remaining numbers a and c
            if (a > c)
            {
                System.out.println(a+" is biggest");
            } else // (a <= c)
            {
                System.out.println(c+" is biggest");
            }
        }
        else // (a <= c)
        {
            // remaining numbers b and c
            if (b > c)
            {
                System.out.println(b+" is biggest");
            } else // (b <= c)
            {
                System.out.println(c+" is biggest");
            }
        }
    }
}

