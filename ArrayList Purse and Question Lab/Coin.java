/**
*  Edit class to fullfill Purse Requirements
*
*  Represents a coin with two sides that can be flipped.
*/


public class Coin
{
   private double value = 0;
   private String type;
   public Coin (char a)
   {
      if (a == 'P')
      {
            value = 0.01; 
            type = "Penny";
      }      
      else if (a == 'N')
      {
            value = 0.05; 
            type = "Nickel";
      }   
      else if (a == 'D')
      {
            value = 0.10; 
            type = "Dime";
      }   
      else if (a == 'Q')
      {
            value = 0.25; 
            type = "Quarter";
      }          
   }

   public String getType()
   {
       return type;
   }
   public double getValue()
   {
       return value;
   }
   /**-----------------------------------------------------------------
   *  Returns the type and value of the coin
           @return String
   */
   public String toString()
   {
     String x = "";
     x+="Type: "+type;
     x+=" Value: "+value;
     return x;
   }
}
