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
        Scanner scan = new Scanner(System.in);
        int[] nim = {3,5,8};
        boolean done = false; boolean p1take = false; boolean p2take = false;
        while(!done)
        {
            while(!p1take)
            {
              nimm.display(nim);
              System.out.println("Player 1 state which pile you would like to take from: 1 2 or 3");
              int x1 = scan.nextInt();
              System.out.println("Player 1 state how much you would like to take from that pile");
              int y1 = scan.nextInt();
              if(x1!=1&&x1!=2&&x1!=3 || nim[x1-1]<y1 || y1 < 1)
                System.out.println("Please take a valid amount of stones from a valid pile");
              else
              {
                nim[x1 - 1] = nim[x1-1] - y1;
                p1take = true;
              }    
            }  
            while(!p2take)
            {
              nimm.display(nim);
              System.out.println("Player 2 state which pile you would like to take from: 1 2 or 3");
              int x2 = scan.nextInt();
              System.out.println("Player 2 state how much you would like to take from that pile");
              int y2 = scan.nextInt();
              if((x2!=1&&x2!=2&&x2!=3) || nim[x2-1]<y2 || y2 < 1)
                System.out.println("Please take a valid amount of stones from a valid pile");
              else
              {
                nim[x2 - 1] = nim[x2-1] - y2;
                p2take = true;
              }    
            } 
            p1take = false;
            p2take = false;   
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

