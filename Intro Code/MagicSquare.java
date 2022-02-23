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
   }
   
   public void setMagicSquare(int [][] array)
   {
       magicsq = array;
   }
   
   public boolean isMagic()
   {
       //creating the initial sum to check
       int sum = getMagicNum();
       //checking each row to see if they yield the same sum
       //starting at 1 because zero would make the same sum
       for(int r = 1; r<magicsq.length; r++)
       {
           if(addRow(r) != sum)
               return false;
       }    
       for(int c = 0; c<magicsq.length; c++)
       {
           if(addColumn(c) != sum)
               return false;
       }    
       //checking diagonals
       return (sum = 
       int checksum = 0;
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
           int sum = 0;
           for(int c = 0; c< magicsq.length; c++)
               sum += magicsq[0][c];
           return sum;
   }
   
   public int addRow(int index)
   {
       int sum = 0;
       for(int c = 0; c < magicsq.length; c++)
           sum += magicsq[index][c];
       return sum;     
   }
   
   public int addColumn(int index)
   {
       int sum = 0;
       for(int r = 0; r < magicsq.length; r++)
           sum += magicsq[r][index];
       return sum;     
   }
   
   public boolean checkDiagonal(int index)
   {
       int checksum = 0;
       for(int r= 0; r<magicsq.length;r++)
           checksum+=magicsq[r+(index*(magicsq.length-(2*r)-1))][r];
       return checksum == getMagicNum();
   }
}// end of class











