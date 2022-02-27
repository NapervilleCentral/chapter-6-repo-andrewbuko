
import java.util.ArrayList;

public class Purse
{
    private ArrayList <Coin> change = new ArrayList();
    private int pennycount = 0;
    private int nickelcount = 0;
    private int dimecount = 0;
    private int quartercount = 0;

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
    public void add (Coin acoin)
    {
        if(change.size() == 0)
            change.add(acoin);
        else
        {
            int i = 0;    
            while(i<change.size() && acoin.getValue() > change.get(i).getValue())
                i++;
        change.add(i,acoin);        
        } 
        
        if(acoin.getType().equals("Penny"))
            pennycount++;
        else if(acoin.getType().equals("Nickel"))
            nickelcount++;
        else if(acoin.getType().equals("Dime"))
            dimecount++;
        else if (acoin.getType().equals("Quarter"))
            quartercount++;    
    }
    
    public void remove (Coin acoin)
    {
        //if (change.contains(acoin))
        {
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
       // else
       //     System.out.println("Error: Coin not found");   
    }

  /** Returns the total value of the coins in the array
  *                 list change
        @return ???
  */
    public double getTotal()
    {
        return (0.01*pennycount+0.05*nickelcount+0.10*dimecount+0.25*quartercount);
    }
    
    public int getNumberofPennies()
    {
        return pennycount;
    }    
    
    public int getNumberofNickels()
    {
        return nickelcount;
    }  
    
    public int getNumberofDimes()
    {
        return dimecount;
    }  
    
    public int getNumberofQuarters()
    {
        return quartercount;
    }  
    


 /**
 *  Returns the all objects in the array list as Strings
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
