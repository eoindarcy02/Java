import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Jumble {
    public static void main(String[] args) throws FileNotFoundException
    {
        File f = new File("D:\\School 2nd Year\\Software Development 2.1\\Work\\Lab 3\\src\\doc.txt");
        Scanner sc = new Scanner(f);
        String words = "";
        while (sc.hasNextLine())
        {
            words = words +sc.nextLine();
        }
        StringBuilder wordRandomise = new StringBuilder();
        int startRand = -1;
        for (int i = 0; i < words.length(); i++)
        {
            char c = words.charAt(i);
            // if we have not found a word (start index != -1 means we have an index of the beginning of a word)
            if (startRand == -1)
            {
                if (!isPunctuationChar(c) && !Character.isWhitespace(c))
                    // begin reading the word
                    startRand = i;
                else
                    // append the character that is a punctuation char or whitespace
                    wordRandomise.append(c);
            }
            else if (isPunctuationChar(c) || Character.isWhitespace(c))
            {
                String word = words.substring(startRand, i);
                if (word.length() > 2)
                { // only words that are 3 characters or longer
                    char[] newWord = word.toCharArray();
                    // shuffle new word
                    for (int j = 1; j < word.length() - 1; j++)
                    {
                        char rand = newWord[j];
                        // exclude begin and end
                        int randomIdx = ThreadLocalRandom.current().nextInt(1, newWord.length - 1);
                        // swap
                        newWord[j] = newWord[randomIdx];
                        newWord[randomIdx] = rand;
                    }
                    wordRandomise.append(newWord);
                }
                else
                    // just append the word
                    wordRandomise.append(word);
                // append the character that is a punctuation char or whitespace
                wordRandomise.append(c);
                // reset start index to begin looking up the beginning of the next word
                startRand = -1;
            }
        }
        int wordCount = countWords(words);
        int vowelCount = processVowels(words);
        System.out.println("Random Sentence is as Follows: " + wordRandomise);
        System.out.println("Word Count is: " + wordCount);
        System.out.println("Vowel Count is: " + vowelCount);
        System.out.println("Average Vowels per Word: " + (double)vowelCount/(double)wordCount);
    }
    // counts by words by adding up amount of spaces
    public static int countWords(String words)
    {
        return words.split(" ").length;
    }
    // count vowels by incrementing value for each vowel in the doc
    public static int processVowels(String words) {
        int count = 0;
        words = words.toLowerCase();
        for (char s : words.toCharArray())
        {
            if (s =='a' || s =='e' || s =='i' || s =='o' || s =='u')
            {
                count++;
            }
        }
        return count;
    }
    //Method used to ignore any Punctuation Characters
    public static boolean isPunctuationChar(char c)
    {
        return "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".indexOf(c) != -1;
    }

}
