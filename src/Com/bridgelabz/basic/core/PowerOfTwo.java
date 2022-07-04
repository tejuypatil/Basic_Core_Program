package Com.bridgelabz.basic.core;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Power of Two:");
        int N=scanner.nextInt();
        for (int i = 0; i <N ; i++) {
            System.out.println("2^"+i+"\t" +Math.pow(2,i));

        }

    }
}
