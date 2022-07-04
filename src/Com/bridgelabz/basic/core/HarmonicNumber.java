package Com.bridgelabz.basic.core;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Harmonic Number:");
        int N=scanner.nextInt();

        // HarmonicSum = 1/1 + 1/2 + 1/3 + ......... + 1/N
        double HarmonicSum= 0;
        for (double i = 1; i<=N ; i++) {

            if (i == N )
            {
                System.out.println("1/"+(int)i+" ");
            }
            else
            {
                System.out.print("1/"+(int)i+" + ");
            }

            HarmonicSum = HarmonicSum + 1 / i;

        }

        System.out.println("Harmonic Sum :" +HarmonicSum);

    }
}
