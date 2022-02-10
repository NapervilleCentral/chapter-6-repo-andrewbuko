import java.util.*;
/**
 * Andrew Bukowski
 * 2/10/22
 * Nim
 * Simulating the game of nim
 */
public class nim
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[] nims = {3,5,8};
        boolean done = false; boolean p1take = false; boolean p2take = false;
        while(!done)
        {
            System.out.println("Player 1 state which pile you would like to take from: 1 2 or 3");
            System.out.println("Player 1 state how much you would like to take from that pile");
            nim.display(nims);
            int x = scan.nextInt();
            while(!p1take)
            {
                
            }    
        }
    }    
    public static void display(int[] x)
    {
        for(int b = 0; b < x.length; b++)
        {
        System.out.print("Pile "+(b+1)+":");    
            for(int p = 0; p < x[b]; p++)
                System.out.print("O");
        
        System.out.println();        
        }
    }    
}

