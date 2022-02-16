
import java.util.ArrayList;

public class Purse
{
    private Coin penny = new Coin("penny", 0.01);
    private Coin nickel = new Coin("nickel", 0.05);
    private Coin dime = new Coin("dime", 0.10);
    private Coin quarter = new Coin("quarter", 0.25);
    private ArrayList <Coin> pocket = new ArrayList<Coin>();


    public Purse (double val)
    { 
        
    }

    public Purse (Coin acoin)
    {
        change.add(acoin);
    }
  /** precondition: Coin will be initialized (value and name) correctly
  *               each variable will have a value
      postcondition: Puts the Coin into the array list change
  */
    public void add (Coin acoin)
    {
        


    }

  /** Returns the total value of the coins in the array
  *                 list change
        @return ???
  */
    public double getTotal()
    {
        double total = 0;
        for(x : 

	}



 /**
 *  Returns the all objects in the array list as Strings
 */

   public String toString()
   {
      return " --";
   }

}
//end of purse
