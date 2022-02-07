import java.util.Scanner;

public class TollRoad {
    //Method used to find the Index of the Array ca
    public static int findIndex(char [] ca, char c)
    {
        for(int i = 0; i < ca.length; i++)
        {
            if(ca[i] == c)
            {
                return i;
            }
        }
        return -1;
    }
    //Method used to pull both Strings on the Array to Join at the Common Char
    public static int [] getOffset(char [] first, char [] second)
    {
        //
        int [] returnValue = {-1,-1};
        for(int i = 0; i < first.length; i++)
        {
            int index = findIndex(second, first[i]);
            if (index != -1)
            {
                returnValue[0] = i;
                returnValue[1] = index;
                return returnValue;
            }
        }
        return returnValue;
    }
    public static void main(String[] args)
    {
        //Creates a Scanner to read in Input of String word1 & word2
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Word of Max 5 Chars: ");
        String s = scan.nextLine();
        System.out.println("Enter another Word of Max 5 Chars: ");
        String w = scan.nextLine();
        char[][] ca = new char[5][5];
        int[] returned = getOffset(s.toCharArray(), w.toCharArray());
        System.out.println("The Common Char is Located at: "+ returned[0] + ", " + returned[1]);
        System.out.println("-------");
        //
        for (int i = 0; i < s.length(); i++)
        {
            ca[returned[1]][i] = s.charAt(i);
        }
        for (int i = 0; i < w.length(); i++)
        {
            ca[i][returned[0]] = w.charAt(i);
        }
        //For Loop and Nested For Loop which scans the row then finds the column of the common char
        for (int i = 0; i < ca.length; i++)
        {
            for (int j = 0; j < ca[i].length; j++)
            {
                System.out.print(ca[i][j]);
            }
            System.out.println();
        }
    }
}