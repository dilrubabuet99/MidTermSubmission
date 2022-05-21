package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {

        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int n=10;
        /*
        int sumUpToN=n*(n+1)/2;
        int arraySum=0;
        for(int i=0; i<array.length; i++)
        {
            arraySum+=array[i];
        }
        System.out.println("The missing number is: "+(sumUpToN-arraySum));
        */
         int []refArray=new int[n+1];
         for(int i=0; i<refArray.length; i++)
         {
             refArray[i]=0;
         }
        for(int i=0; i<array.length; i++)
        {
            refArray[array[i]]=1;
        }

        System.out.print("Missing numbers: ");
        for(int i=1; i<refArray.length; i++)
        {
            if(refArray[i]==0)
                System.out.print(i+" ");
        }













    /*Calculate the summation of first N natural numbers as Total = N * (N + 1) / 2
    Create a variable sum to store the summation of elements of the array.
    Iterate the array from start to end.
    Updating the value of sum as sum = sum + array[i]
    Print the missing number as the Total – sum
    */


            /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */


    }
}
