package Com.bridgelabz.basic.core;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x, y;
        int t;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of X and Y");
        x = s.nextInt();
        y = s.nextInt();
        System.out.println("Before swapping no: " +x +"  "+y);
        t = x;
        x = y;
        y = t;

        System.out.println("After swapping: "+x +"  " +y);
        System.out.println();
    }
}
