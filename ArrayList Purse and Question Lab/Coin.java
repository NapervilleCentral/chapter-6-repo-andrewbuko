/**
*  Edit class to fullfill Purse Requirements
*
*  Represents a coin with two sides that can be flipped.
*/


public class Coin
{
   //setting default coin values
   private double value = 0;
   private String type;
   /**
    * Initializing the coin value as a coin based on the
    * character parameter
    * @param char coin character
    */
   public Coin (char a)
   {
      //based on P N D Q, assigns the coin to a type and value 
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
/**-----------------------------------------------------------------
   *  Returns type of the coin
           @return String type
   */
   public String getType()
   {
       return type;
   }
   /**-----------------------------------------------------------------
   *  Returns value of the coin
           @return double value
   */
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
