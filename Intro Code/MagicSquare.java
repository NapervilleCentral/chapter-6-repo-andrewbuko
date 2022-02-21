/********************************************************************
// Starter Code for Magic Square

Write a program to input lines of data into a two dimensional array. (data file or initializer  list). 
The program should determine whether or not the square is a magic square. 
Program efficiency should be such that computations end as soon as two different sums have been computed.  
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.*;

public class MagicSquare

{  private int [][] magicsq;
    
   public MagicSquare(int [][] array)
   {
       magicsq = array;
   }//end of main
   
   public void setMagicSquare(int [][] array)
   {
       magicsq = array;
   }
   
   public boolean isMagic()
   {
       int sum = 0;
       //creating the initial sum to check
       for(int c = 0; c< magicsq.length; c++)
           sum += magicsq[0][c];
       int checksum;  
       //checking each row to see if they yield the same sum
       //starting at 1 because zero would make the same sum
       for(int r = 1; r<magicsq.length; r++)
       {
           checksum = 0;
           for (int c = 0; c<magicsq.length; c++)
           {
               checksum+=magicsq[r][c];
           }
           if(checksum != sum)
               return false;
       }    
       for(int c = 0; c<magicsq.length; c++)
       {
           checksum = 0;
           for (int r = 0; c<magicsq.length; c++)
           {
               checksum+=magicsq[r][c];
           }
           if(checksum != sum)
               return false;
       }    
       //checking diagonals
       checksum = 0;
       for(int r= 0; r<magicsq.length;r++)
           checksum+=magicsq[r][r];
       if(checksum != sum)
            return false;
       checksum = 0;
       for(int r= 0; r<magicsq.length;r++)
           checksum+=magicsq[magicsq.length-r-1][r];
       return (checksum == sum);
   }
   
   public int getMagicNum()
   {
       if(isMagic())
       {
           int sum = 0;
           for(int c = 0; c< magicsq.length; c++)
               sum += magicsq[0][c];
           return sum;    
       }
       return -1;
   }
}// end of class











