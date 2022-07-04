package Com.bridgelabz.basic.core;

import static java.lang.Math.random;

public class FlipCoin {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int NumberOfTrails = 200;

        for (int i = 0; i < NumberOfTrails; i++) {

            if (Math.random() < 0.5) {
                System.out.println("Head");
                heads++;
            } else {
                System.out.println("Tail");
                tails++;
            }
        }


        System.out.println("Number of count Head: " + heads);
        System.out.println("Number of count Tails: " + tails);

        double headpercent = (double) heads / NumberOfTrails * 100;
        double tailpercent = (double) tails / NumberOfTrails * 100;

        System.out.println("Percentage of Head: " + headpercent);

        System.out.println("Percentage of Tails " + tailpercent);
    }
}
