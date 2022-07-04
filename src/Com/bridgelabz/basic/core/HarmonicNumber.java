package Com.bridgelabz.basic.core;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Harmonic Number:");
        int N=scanner.nextInt();

        double HarmonicSum= 0;
        for (double i = 1; i<=N ; i++) {
            HarmonicSum = HarmonicSum + 1 / i;

        }
        System.out.println("Harmonic Sum :" +HarmonicSum);

    }
}
