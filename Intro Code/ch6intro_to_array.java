/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;


public class ch6intro_to_array

{
    final static int MAX = 20;

    public static void main (String[] args)
    {
    
    /*
            mathy useful = new mathy();
            int x = 50;
            int[] nums = new int[20];
            int[] values = new int[MAX];
            //.length not a method public data
            int[] oddnums = new int[nums.length];
            int[] evennums = new int[nums.length];
            int[] negnums = new int[MAX];
    
           Random gen = new Random();
           
           for (int i = 0; i<nums.length ;i++)
           {
               nums[i] = gen.nextInt(100)-50;
               
           }    
           
           for(int s : nums)
               System.out.print(s+" ");
           System.out.println("number of odd values "+odd(nums)); 
           
           evennums = useful.getEvens(nums);
           for(int s : evennums){
           if(s != 10001) 
           System.out.print(s+" ");}
           
           
            int [] nums2 = {-3,5,1,4,66,33,-27,38,88,73};
           /*
           int [] odd = new int[nums2.length]; 
           oddnums = useful.getOdd(nums2,odd);
           for(int s : oddnums){
           if(s != 10001) 
           System.out.print(s+" ");}
            
    /*
    
            System.out.println(Searches.linearSearch(num,look)  );
            Sorts.selectionSort(num);
            System.out.println(Searches.binarySearch(num,look)  );
    
    
    
            //for each loop
    /*
    
            useful.getOdd(num,oddnum);
    
    
    
    
            //System.out.println("----------SORTING-----------"  );
    
    
    
    
    
    
    /*
            System.out.println("Enter a number");
            int find = Keyboard.readInt();
    
            System.out.println(Searches. binarySearch(num,find));
    
       /*
    
    
    
    
    
    
    
     /*
           //make a two dementional array
           int [][] table = new int [5][10];
    
           // Load the table with values
           for (int row=0; row < table.length; row++)
              for (int col=0; col < table[row].length; col++)
                 table[row][col] = row * 10 + col;
    
           //print the table
            for (int row=0; row < table.length; row++)
            {
                for (int col=0; col < table[row].length; col++)
                    System.out.print (table[row][col] + "\t");
    
                System.out.println();
            }
    
    
        // make a 2d array with an iniitalizer list.
        //print the length of row and col
    /**/
        int [][] scores = { {1,2,3},//6
                            {2,2,3},//7
                            {3,2,3},//8
                            {4,2,3}    };//9
    
        System.out.println(scores[2][1]);
        //how many columns
        System.out.println(scores[0].length+"col");
        //how many rows
        System.out.println(scores.length+"row");
        
        mathy.print2D(scores);
    
        int arraySum = 0;
        
        for(int r = 0; r<scores.length;r++)
            for(int c = 0; c<scores[0].length;c++)
                arraySum+=scores[r][c];
        //sum entire 2D array
        System.out.print("The sum of this array is"+arraySum );
        
        int lastsum = 0;
        for(int r = 0; r<scores[scores.length-1].length;r++)
                lastsum+=scores[r][scores.length-1];
        //sum a row of 2D array
        System.out.print("The sum of row "+lastsum);
    
    
    
    
    
    
    
    /**/
    }// end of main

   public static int[] doubleSize(int[] array)
   {


        return array;


   }

//passing int by value
   public static void foo(int x)
   {

       x = 100;
   }


//arrays are passed by reference
    public static void foo(int [] num)
      {

          num[0] = 100;

      }

    


   public static int odd(int [] num )
   {
       int arthur = 0;
       for(int x : num)
       {
           if (x % 2 != 0)
           arthur++;
       }    
       return arthur;

   }// end of odd

    /*  */
}// end of class











