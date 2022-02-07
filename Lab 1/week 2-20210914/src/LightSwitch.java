import java.util.Scanner;

public class LightSwitch {
    //Creates both true and false static boolean methods
    static boolean working = true;
    static boolean status = false;

    public static void checkInput(String input)
    {
        //Creates If statement where user inputs "-" then system "the light is off"
        if(status && input.equals("-"))
        {
            status = false;
            System.out.println("the light is off");
        }
        //Creates else if statement where user inputs "+" then system "the light is on"
        else if (!status && input.equals("+"))
        {
            status = true;
            System.out.println("the light is on");
            //Uses math.random to pick a random number between 1 and 20
            int random  = (int) (Math.random() * 20);
            //System.out.println(random);
            //If no. is less than 10 then the light is no longer working
            if (random > 10)
            {
                working =  false;
            }
        }
    }

    public static void main(String[] args) {
        int i = 0;

        System.out.println("please enter a valid input of + or -");
        //Creates while loop where if static boolean = true  then it prompts user for another input
        while (working)
        {
           Scanner sc = new Scanner(System.in);
            if (sc.hasNext())
            {
                String input = sc.next();
                if(input.equals("+") || input.equals("-"))
                {
                    checkInput(input);
                }
                else
                {
                    System.out.println("please enter a valid input");
                }

            }

        }

        System.out.println("the bulb has blown");
    }
}
