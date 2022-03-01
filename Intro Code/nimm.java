import java.util.*;
/**
 * Andrew Bukowski
 * 2/10/22
 * Nim
 * Simulating the game of nim
 */
public class nimm
{
    public static void main(String args[])
    {
        //initializing scanner, nim stone values,
        //boolean if player takes stone, and winner value
        Scanner scan = new Scanner(System.in);
        int[] nim = {3,5,8};
        boolean p1take = false; boolean p2take = false;
        int winner = 0;
        while (winner == 0)
        {
            while(!p1take)
            {
              //displaying the stones and asking how many stones and which pile to take from 
              nimm.display(nim);
              System.out.println("Player 1 state which pile you would like to take from: 1 2 or 3");
              int x1 = scan.nextInt();
              System.out.println("Player 1 state how much you would like to take from that pile");
              int y1 = scan.nextInt();
              //checking if valid inputs and using short circuiting to avoid errors
              if(x1!=1&&x1!=2&&x1!=3 || nim[x1-1]<y1 || y1 < 1)
                System.out.println("Please take a valid amount of stones from a valid pile");
              else
              {
                //taking the stones from the piles  
                nim[x1 - 1] = nim[x1-1] - y1;
                p1take = true;
              }
            }  
            //checking if the game is over and ending the program if it does
            if(nim[0] == 0 && nim[1] == 0 && nim[2] == 0)
            {
                p2take = true;
                winner = 2;
            }    
            while(!p2take)
            {
              //displaying the stones and asking how many stones and which pile to take from 
              nimm.display(nim);
              System.out.println("Player 2 state which pile you would like to take from: 1 2 or 3");
              int x2 = scan.nextInt();
              System.out.println("Player 2 state how much you would like to take from that pile");
              int y2 = scan.nextInt();
              //checking if valid inputs and using short circuiting to avoid errors
              if((x2!=1&&x2!=2&&x2!=3) || nim[x2-1]<y2 || y2 < 1)
                System.out.println("Please take a valid amount of stones from a valid pile");
              else
              {
                //taking the stones from the piles  
                nim[x2 - 1] = nim[x2-1] - y2;
                p2take = true;
              }    
            } 
            //resetting take values and deciding if the game is over or not
            p1take = false;
            p2take = false;
            if(winner == 0 && nim[0] == 0 && nim[1] == 0 && nim[2] == 0)
                winner = 1;
        }
        System.out.println("The winner is player "+winner);
    }    
    public static void display(int[] x)
    {
        //for loop to print the amount of stones per pile in their respective piles
        for(int b = 0; b < x.length; b++)
        {
        System.out.print("Pile "+(b+1)+":");    
            for(int p = 0; p < x[b]; p++)
                System.out.print("O");
        
        System.out.println();        
        }
    }    
}

