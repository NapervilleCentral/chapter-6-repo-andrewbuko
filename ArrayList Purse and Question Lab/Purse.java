
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
            
        }    

    }
    
    public int getNumberofPennies()
    {
        
    }    
    
    public int getNumberofNickels()
    {
        
    }  
    
    public int getNumberofDimes()
    {
        
    }  
    
    public int getNumberof()
    {
        
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
