package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int n=40;

        int p=0;
        int c=1;

        int t;
        for(int i=1; i<=n; i++)
        {
            System.out.print(p+" ");
            t=p;
            p=c;
            c=c+t;
        }


    }
}
