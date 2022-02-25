
import java.util.ArrayList;

public class Purse
{
    private ArrayList <Coin> change = new ArrayList();


    public Purse ()
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
        if (change.
        
        change.add(acoin);
    }

  /** Returns the total value of the coins in the array
  *                 list change
        @return ???
  */
    public double getTotal()
    {
        double total = 0;
        for(Coin x : change)
        {
            total+=x.getValue();
        }    
        return total;
    }
    
    public double getNumberofPennies()
    {
        double total = 0;
        for (Coin x : change)
        {
            if(x.getName().equals("Penny"))
                total+=x.getValue();
                
        }    
        return total;
    }    
    
    public double getNumberofNickels()
    {
        double total = 0;
        for (Coin x : change)
        {
            if(x.getName().equals("Nickel"))
                total+=x.getValue();
                
        }    
        return total;
    }  
    
    public double getNumberofDimes()
    {
        double total = 0;
        for (Coin x : change)
        {
            if(x.getName().equals("Dime"))
                total+=x.getValue();
                
        }    
        return total;
    }  
    
    public double getNumberofQuarters()
    {
        double total = 0;
        for (Coin x : change)
        {
            if(x.getName().equals("Quarter"))
                total+=x.getValue();
                
        }    
        return total;
    }  
    


 /**
 *  Returns the all objects in the array list as Strings
 */

   public String toString()
   {
      ;
   }

}
//end of purse
