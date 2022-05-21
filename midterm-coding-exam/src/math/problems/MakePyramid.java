package math.problems;

public class MakePyramid {

    public static void pyramidPattern(int n) {
        for (int j = 0; j <= n; j++) {
            for (int k = 0; k < n - j; k++)  //if j==0 repeat 4 times...
            {
                System.out.print(" ");
            }
            for (int i = 0; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 6;
        pyramidPattern(n);
    }
        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */


    /*

          *
         * *
        * * *
       * * * *
      * * * * *
     * * * * * *


     */
}
