import java.util.Locale;
import java.util.Scanner;

public class StringDetails {

    //Create Int which counts no. of vowels which then converts all characters typed to lower case letters.
    public static void getVowels(String s)
    {
        int numVowels = 0;
        s =  s.toLowerCase();
        //For loop created which counts number of vowels in word and adds them to num of vowels as +1
        for(char c : s.toCharArray())
        {
            if (c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' )
            {
                numVowels++;
            }
        }
        //Prints out statement followed by total no. of vowels
        System.out.println("num vowels is " + numVowels);
    }
    //Uses getter method to find values of string s followed by length of string s
    public static void getStringDetails(String s)
    {
        System.out.println("The word entered is " +s);

        System.out.println("the length is " + s.length());
        //Gets total no. of vowels from string s and also prints starting and ending character of the string
        getVowels(s);

        System.out.println("the first letter is "
                + s.charAt(0));
        System.out.println("the last letter is "
                + s.charAt(s.length()-1));
    }
    //Prompts user to enter a word
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner sc = new Scanner(System.in);

        if(sc.hasNext())
        {
            getStringDetails(sc.next());
        }
    }
}
