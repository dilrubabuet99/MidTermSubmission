package math.problems;

public class Factorial {

    public static int recFact(int n)
    {
        if(n==1) return 1;
        return n*recFact(n-1);
    }
    public static int iterativeFact(int num)
    {
        int factorial =1;
        for (int i=1;i<=num;i++)
        {
            factorial=factorial*i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        int n=5;
        System.out.println("Factorial of a number in iterative method is:  "+ iterativeFact(n));
        System.out.println("Factorial of a number in recursive method is:  "+ recFact(n));
    }
}



