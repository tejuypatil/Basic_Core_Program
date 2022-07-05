package Com.bridgelabz.basics;

import java.util.Scanner;

public class PatternProgram {
    public static void main(String[] args) {
        int n, i, j;
        System.out.println("Enter the number of row:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (i = 0; i < n; i++) {
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}








