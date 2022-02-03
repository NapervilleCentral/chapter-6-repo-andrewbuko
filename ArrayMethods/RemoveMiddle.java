import java.util.Random;

public class RemoveMiddle
{
   public void removeMiddle(int[] arr)
   {
      int size = arr.length;
      if (size % 2 == 0)
      {
         for (int i = (arr.length-2)/2; i < arr.length-2; i++)
          {
              arr[i] = arr[i+2];
          }  
         arr[arr.length-2] = 0; 
      }
      if (size % 2 == 1)
      {
          for (int i = (arr.length+1)/2; i < arr.length; i++)
          {
              arr[i-1] = arr[i];
          }   
          
      }    
      arr[arr.length-1] = 0;
      
      // Size is odd

         // Figure out starting point for removal


         // Remove middle element


   }

   public static void main(String[] args)
   {
      int[] randoms = new int[11];
      RemoveMiddle util = new RemoveMiddle();
      Random generator = new Random();

      // Create a test array containing random numbers
      for (int i = 0; i < randoms.length; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Remove the middle element(s)
      util.removeMiddle(randoms);

      // Print again to see new order.
      for (int i = 0; i < randoms.length; i++)
      {
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      randoms = new int[10];
      // Create a test array with an even number of elements
      for (int i = 0; i < randoms.length; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Remove the middle element(s)
      util.removeMiddle(randoms);

      // Print again to see new order.
      for (int i = 0; i < randoms.length; i++)
      {
         System.out.print(randoms[i] + " ");
      }
      System.out.println();
   }
}
