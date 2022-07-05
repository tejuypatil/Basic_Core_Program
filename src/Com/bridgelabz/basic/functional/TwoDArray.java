package Com.bridgelabz.basic.functional;

import java.util.Scanner;

public class TwoDArray {


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Number of Rows (M):" );
        int M = s.nextInt();
        System.out.println("Number of Columns (N):" );
        int N = s.nextInt();
        System.out.println("Enter type of array:");
        System.out.println("1.double");
        System.out.println("2.integer");
        System.out.println("3.boolean");
        int type = s.nextInt();

        double [][] double2DArray=new double[M][N];
        int [][] integer2DArray=new int[M][N];
        boolean [][] booleans2DAray=new boolean[M][N];
        for (int i = 0; i < M; i++) {
            System.out.println("Enter Row " +i+":");
            for (int j = 0; j <N ; j++) {
                if (type == 1){
                    double2DArray[i][j]= s.nextDouble();
                }
                else if (type == 2) {
                    integer2DArray[i][j]= s.nextInt();
                }
                else if (type == 3) {
                    booleans2DAray[i][j]= s.nextBoolean();
                }

            }

        }


        // -------------------------------------------
        //printing array
        for (int i = 0; i <M ; i++) {
            for (int j = 0; j < N ; j++) {

                if (type == 1){
                    System.out.print(double2DArray[i][j] +" ");
                }
                else if (type == 2) {
                    System.out.print(integer2DArray[i][j] +" ");
                }
                else if (type == 3) {
                    System.out.print(booleans2DAray[i][j] +" ");
                }
            }
            System.out.println();

        }
    }
}
