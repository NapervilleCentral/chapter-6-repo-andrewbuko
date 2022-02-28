import java.util.Scanner;
/**
 * Andrew Bukowski
 * 2-23-22
 * Client
 * Main method to run the menu for the purse
 */
public class Client
{
    public static void main(String args[])
    {
        //creating purse object
        Purse purse = new Purse();
        //x representing the menu input to do a desired task
        Scanner user = new Scanner(System.in);
        char x = 0;
        while(x != 'E' && x != 'e')
        {
            //getting user input
            System.out.println("A - Add a Coin\nR - Remove a Coin\n? - Display Purse\nE - Exit");
            x = user.next().charAt(0);
            if(x == 'a' || x == 'A')
            {
                //asking user what coin to add based on char value
                System.out.println("What coin would you like to add?\nP - penny\nN - nickel\nD - dime\nQ - quarter");
                char x1 = user.next().charAt(0);
                if (x1 == 'P' || x1 == 'p')
                {
                    purse.add(new Coin('P'));
                    System.out.println("Successfully added a penny to the purse. You now have "+purse.getNumberofPennies()+" pennies"); 
                }
                else if (x1 == 'N' || x1 == 'n')
                {
                    purse.add(new Coin('N'));
                    System.out.println("Successfully added a nickel to the purse. You now have "+purse.getNumberofNickels()+" nickels"); 
                }
                else if (x1 == 'D' || x1 == 'd')
                {
                    purse.add(new Coin('D'));
                    System.out.println("Successfully added a dime to the purse. You now have "+purse.getNumberofDimes()+" dimes"); 
                }
                else if (x1 == 'Q' || x1 == 'q')
                {
                    purse.add(new Coin('Q'));
                    System.out.println("Successfully added a quarter to the purse. You now have "+purse.getNumberofQuarters()+" quarters"); 
                }
                //if invalid input
                else
                    System.out.println("Please type in a valid input.");
            }
            else if(x == 'r' || x == 'R')
            {
                //asking user what coin to remove, then getting char value
                System.out.println("What coin would you like to remove?\nP - penny\nN - nickel\nD - dime\nQ - quarter");
                char x2 = user.next().charAt(0);
                //removing coin based on char and if the purse has coin to remove
                if ((x2 == 'P' || x2 == 'p') && purse.getNumberofPennies() > 0)
                {
                    purse.remove(new Coin('P'));
                    System.out.println("Successfully removed a penny to the purse. You now have "+purse.getNumberofPennies()+" pennies");     
                }
                else if ((x2 == 'N' || x2 == 'n' )&& purse.getNumberofNickels() > 0)
                {
                    purse.remove(new Coin('N'));
                    System.out.println("Successfully removed a nickel to the purse. You now have "+purse.getNumberofNickels()+" nickels"); 
                }
                else if ((x2 == 'D' || x2 == 'd') && purse.getNumberofDimes() > 0)
                {
                    purse.remove(new Coin('D'));
                    System.out.println("Successfully removed a dime to the purse. You now have "+purse.getNumberofDimes()+" dimes"); 
                }
                else if ((x2 == 'Q' || x2 == 'q') && purse.getNumberofQuarters() > 0)
                {
                    purse.remove(new Coin('Q'));
                    System.out.println("Successfully removed a quarter to the purse. You now have "+purse.getNumberofQuarters()+" quarters"); 
                }
                //if invalid input
                else
                    System.out.println("There are no coins of this type to remove");
            }
            //displaying tostring of the purse
            else if(x == '?')
                System.out.println(purse);
            //if not one of the valid inputs    
            else if (x != 'E' && x != 'e')
                System.out.println("Please type in a valid input");
        }
        //bye :D
        System.out.println("See you later :D");
    }
}
