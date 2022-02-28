
import java.util.ArrayList;
/**
 * Andrew Bukowski
 * 2-23-2021
 * Purse Lab
 * Simulates a purse with coins to be used in Client
 */
public class Purse
{
    //initializing a list of coins and a count for the amount of coins
    private ArrayList <Coin> change = new ArrayList();
    private int pennycount = 0;
    private int nickelcount = 0;
    private int dimecount = 0;
    private int quartercount = 0;
    /**
     * Initializes the purse and popuplating with coins equal
     * to an amount greater than $1
     */
    public Purse ()
    { 
        add(new Coin('P'));
        add(new Coin('N'));
        add(new Coin('D'));
        add(new Coin('Q'));
        add(new Coin('Q'));
        add(new Coin('Q'));
        add(new Coin('Q'));
    }
  /** precondition: Coin will be initialized (value and name) correctly
  *               each variable will have a value
      postcondition: Puts the Coin into the array list change
  */
    /**
     * Takes a coin and adds it ot the list, ordering by coin value
     * @param Coin acoin
     */
    public void add (Coin acoin)
    {
        //finding where to place the coin in the list
        if(change.size() == 0)
            change.add(acoin);
        else
        {
            int i = 0;    
            while(i<change.size() && acoin.getValue() > change.get(i).getValue())
                i++;
        change.add(i,acoin);        
        } 
        //adding to the amount of that coin, depending on the type of coin
        if(acoin.getType().equals("Penny"))
            pennycount++;
        else if(acoin.getType().equals("Nickel"))
            nickelcount++;
        else if(acoin.getType().equals("Dime"))
            dimecount++;
        else if (acoin.getType().equals("Quarter"))
            quartercount++;    
    }
    /**
     * Takes a coin and removes it from the list
     * @param Coin acoin
     */
    public void remove (Coin acoin)
    {
        //out of bounds errors taken care of in client code
        //removing the coin and decreasing the count based on the type of coin
        change.remove(acoin);
        if(acoin.getType().equals("Penny"))
            pennycount--;
        else if(acoin.getType().equals("Nickel"))
            nickelcount--;
        else if(acoin.getType().equals("Dime"))
            dimecount--;
        else if (acoin.getType().equals("Quarter"))
            quartercount--;
       
    }

  /** Returns the total value of the coins in the array
  *                 list change
        @return total
  */
    public double getTotal()
    {
        return (0.01*pennycount+0.05*nickelcount+0.10*dimecount+0.25*quartercount);
    }
    /**
     * Returns the amount of pennies in the purse
     * @return pennycount
     */
    public int getNumberofPennies()
    {
        return pennycount;
    }    
    /**
     * Returns the amount of nickels in the purse
     * @return nickelcount
     */
    public int getNumberofNickels()
    {
        return nickelcount;
    }  
    /**
     * Returns the amount of dimes in the purse
     * @return dimecount
     */
    public int getNumberofDimes()
    {
        return dimecount;
    }  
    /**
     * Returns the amount of quarters in the purse
     * @return quartercount
     */
    public int getNumberofQuarters()
    {
        return quartercount;
    }  
    


 /**
 *  Returns the counts for the purse and the total
 *  @return String of purse information
 */

   public String toString()
   {
      String x = "";
      x+=pennycount+" Pennies .01\n";
      x+=nickelcount+ " Nickels .05\n";
      x+=dimecount+" Dimes .10\n";
      x+=quartercount+" Quarters .25\n";
      x+="Total: $"+getTotal();
      return x;
   }

}
//end of purse
