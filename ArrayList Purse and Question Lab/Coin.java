/**
*  Edit class to fullfill Purse Requirements
*
*  Represents a coin with two sides that can be flipped.
*/


public class Coin
{
   private double val = 0;
   private String name;
   public Coin (String nam, double v)
   {
      name = nam;
      val = v;
   }

   public String getName()
   {
       return name;
   }
   public double getValue()
   {
       return val;
   }
   /**-----------------------------------------------------------------
   *  Returns the name and value of the coin
           @return String
   */
   public String toString()
   {
     String x = "";
     x+="Name: "+name;
     x+=" Value: "+val;
     return x;
   }
}
