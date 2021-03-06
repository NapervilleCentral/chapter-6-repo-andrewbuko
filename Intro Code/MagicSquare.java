/********************************************************************
Andrew Bukowski
2-21-22
Magic Square
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
   /**
    * Takes an array and sets it as an array in the constructor
    * @param magic square int [][] array
    */ 
   public MagicSquare(int [][] array)
   {
       magicsq = array;
   }
   /**
    * Takes an array and sets it as an array in a method
    * @param magic square int [][] array
    */ 
   public void setMagicSquare(int [][] array)
   {
       magicsq = array;
   }
   /**
    * Finds out if a square is a magic square, that is if the rows, columns, and diagonals all add to the same value 
    * @return boolean if the square is magic or not
    */
   public boolean isMagic()
   {
       //checking each row to see if they yield the same sum
       //starting at 1 because zero would make the same sum
       for(int r = 1; r<magicsq.length; r++)
       {
           if(addRow(r) != getMagicNum())
               return false;
       }    
       //checking each column to see if it yields the magic sum
       for(int c = 0; c<magicsq.length; c++)
       {
           if(addColumn(c) != getMagicNum())
               return false;
       }    
       //checking diagonals using the diagonal method
       return (checkDiagonal(0) && checkDiagonal(1));
   }
   /**
    * Taking the sum of the first row to find what would be the magic number
    * @return magic number (sum of the first row)
    */
   public int getMagicNum()
   {
           int sum = 0;
           //goes through each value of the first row
           for(int c = 0; c< magicsq.length; c++)
               sum += magicsq[0][c];
           return sum;
   }
   /**
    * Takes the sum of a row
    * @param index
    * @return sum
    */
   public int addRow(int index)
   {
       int sum = 0;
       //goes through each value of the row
       for(int c = 0; c < magicsq.length; c++)
           sum += magicsq[index][c];
       return sum;     
   }
   /**
    * Takes the sum of a column
    * @param index
    * @return sum
    */
   public int addColumn(int index)
   {
       int sum = 0;
       //goes thorugh each value of the column
       for(int r = 0; r < magicsq.length; r++)
           sum += magicsq[r][index];
       return sum;     
   }
   /**
    * Takes the sum of a diagonal and checks against the magic number to see if it is equal
    * @param index
    * @return boolean if diagonal is equal to the magic number
    */
   public boolean checkDiagonal(int index)
   {
       int checksum = 0;
       //the index represents if the summation starts at the top left or bottom left,
       //if so changing the row value from r to magicsq.length - r - 1
       for(int r= 0; r<magicsq.length;r++)
           checksum+=magicsq[r+(index*(magicsq.length-(2*r)-1))][r];
       return checksum == getMagicNum();
   }
}// end of class











