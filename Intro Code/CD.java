//********************************************************************
//  CD.java       Author: Lewis/Loftus/Cocking
//
//  Represents a compact disc.
//********************************************************************

import java.text.NumberFormat;

public class CD
{
   private String title, artist;
   private double cost;
   private int tracks;
   private double rating;
   private String genre;

   //-----------------------------------------------------------------
   //  Creates a new CD with the specified information.
   //-----------------------------------------------------------------
   public CD (String name, String singer, double price, int numTracks)
   {
      title = name;
      artist = singer;
      cost = price;
      tracks = numTracks;
      rating = 0;
   }
   //-----------------------------------------------------------------
      //  Creates a new CD with the specified information.
      //-----------------------------------------------------------------
      public CD (String name, String singer, double price, int numTracks, double rate)
      {
         title = name;
         artist = singer;
         cost = price;
         tracks = numTracks;
         rating = rate;
   }

   /**
   create hashCode() method
   will use all static information and creat hashCode
   mulitply by prime number
   @return int - the hash Code

   */
    public int hashCode()
    {
        int code = 0;
        for(int i = 0; i < title.length(); i++)
            code+=31*title.charAt(i);
        for(int i = 0; i < artist.length(); i++)
            code+=73*artist.charAt(i);
        code+=229*cost;
        code+=101*tracks;
        return code;
    }
   //-----------------------------------------------------------------
   //  Returns a description of this CD.
   //-----------------------------------------------------------------
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String description;

      description = fmt.format(cost) + "\t" + tracks + "\t";
      description += title + "\t" + artist+ "\t"+ rating;

      return description;
   }
}
