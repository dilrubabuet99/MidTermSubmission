package string.problems;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";


        st = st.toLowerCase();

        String[] words = st.split(" ");
        int length = words.length;
        for( int i=0; i < length; i++)
        {

            int count = 1;
            for(int j=i+1; j < length; j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++;

                    words[j] = "0";
                }
            }
            if (words[i] != "0" && count > 1)
                System.out.print(" "+words[i]+" ");
        }


    }

}
