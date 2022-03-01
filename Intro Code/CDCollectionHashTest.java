/**
 * Andrew Bukowski
 * 2/27/21
 * CDCollectionHashTest
 * Main method to test the CD class
 */
public class CDCollectionHashTest
{
  public static void main(String[] args)
  {
    //make CD Array
    CD[] db = new CD[19];

    db[0]=(new CD("Summer Teeth","Wilco",13.00,17,5));
    db[1]=(new CD("Sea of Noise","St. Paul and the Broken Bones", 10.99,20,5));
    db[2]=(new CD("Donda","Kanye West", 1.99,27,3.5));
    db[3]=(new CD("Witness", "Benjamin Booker",11.49, 12,5));
    db[4]=(new CD("Strange Desire","Bleachers", 9.00,16,4));
    db[5]=(new CD("Feel your Feelings Fool!","The Regretts", 7.99,15,5));
    db[6]=(new CD("The Ride","Catfish and the Bottlemen", 9.99,11,4.5));
    db[7]=(new CD("Everybody Wants","The Struts", 11.79,13,5));
    db[8]=(new CD("Comming Home","Leon Bridges", 12.49,10,5));
    db[9]=(new CD("If'n","fIREHOSE", 10.09,14,5));
    db[10]=(new CD("Let it Be","The Replacements", 8.99,16,5));
    db[11]=(new CD("A Positive Rage","The Hold Steady", 10.49,16,4.5));
    db[12]=(new CD("Let the Record Play","Moon Taxi", 1.99,10,2.5));
    db[13]=(new CD("Rainbow","Kesha", 7.19,10,1.5));
    db[14]=(new CD("Punisher","Phoebe Bridgers", 5.99,11,4.5));
    db[15]=(new CD("Nervous System","Julia Michaels", 6.99,7,1.5));

    db[16]=(new CD("Tim","The Replacements", 8.99,16,5));
    db[17]=(new CD("AM","Wilco",13.00,17,5));
    db[18]=(new CD("Songs about Jane","Maroon 5", 5.99,10,.5));

    //create a hash Table (playlist) of appropreate size
    CD hashTable[] = new CD[38];
    // place the cd's in the new hash table playlist
    
    for(int i = 0; i < 19; i++)
    {  
       hashTable[(db[i]).hashCode() % 38 ] = db[i]; // mod 38 is the index of the hashcode

    }    
    
    //do not worry about collisions, that is someone elses problem
    for(int i = 0; i<38; i++)
    {
        System.out.println(hashTable[i]);
    }

    //displays the entire hash table
    //of CD's "Artist"--"CD"--"Number of Tracks"
    



  }
}

