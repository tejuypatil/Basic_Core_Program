package Com.bridgelabz.basic.core;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter an Integer number:");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        if (num % 2 == 0) {
            System.out.println(num+ " Number is Even");
        }
        else {
            System.out.println(num+ " Number is Odd");
        }
    }
}
