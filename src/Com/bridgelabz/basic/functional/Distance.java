package Com.bridgelabz.basic.functional;

public class Distance {
    static double distance( int x1, int y1, int x2, int y2 )
    {
        /*
        *         |                  *
        *         |                 (x2,y2)
        *         |         dist
        *         |
        *         |   * (x1,y1)
        *         |
        * --------+------------------
        *         |
        *         |
        *
        * Formula for distance
        * Sqrt( (x2-x1)^2 + (y2-y1)^2 ) -Euclidean distance
        */
        return Math.sqrt(Math.pow(x2 -x1 ,2) + Math.pow(y2 - y1, 2));
    }
    public static void main(String[] args) {
        System.out.println(distance( 3,4,4,3));
    }
}
