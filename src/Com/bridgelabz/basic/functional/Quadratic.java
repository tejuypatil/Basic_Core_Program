package Com.bridgelabz.basic.functional;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("quadratic equation a*x^2 + b*x + c = 0");
        System.out.println("Enter values for a, b, c");
        System.out.print("Input a: ");
        double a = input.nextDouble();
        System.out.print("Input b: ");
        double b = input.nextDouble();
        System.out.print("Input c: ");
        double c = input.nextDouble();

        // Roots of quadratic equation
        // delta = b*b - 4*a*c
        //
        // x1 = ( -b + sqrt(delta) ) / (2*a)
        //             AND
        // x2 = ( -b - sqrt(delta) ) / (2*a)

        double delta = b * b - 4.0 * a * c;
        double x1=( -b + Math.sqrt(delta) ) / (2*a);
        double x2=( -b - Math.sqrt(delta) ) / (2*a);

        System.out.println("Roots for "+a+"*x^2 + "+b+"*x + "+c+" = 0 are");
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
    }

}
