import java.util.*;
import java.io.*;

/**
 * Arthur Xu and Andrew Bukowski
 * 2/09/2022
 * Sorter for the quiz
 */
public class sorter
{
    public static void main(String[] args) throws IOException
    {
        String x = "";
        Scanner input = new Scanner(new File("words.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (input.hasNext())
        {
            x = input.nextLine();
            if (x.length() == 6)
                list.add(x);
        }
        for (int i = list.size() - 1; i >= 0; i--)
        {
            if (vowel(list.get(i)))
               list.remove(i);
        }
        for (int i = list.size() - 1; i > 0; i--)
        {
            if (list.get(i).equals(list.get(i - 1)))
                list.remove(i);
        }
        System.out.println(list.size());
    }
    public static boolean vowel (String a)
    {
        for (int i = 0; i < a.length() - 1; i++)
        {
            if (a.substring(i, i + 2).equals("ii") || a.substring(i, i + 2).equals("uu") || a.substring(i, i + 2).equals("aa"))
                return true;
        }
        return false;
    }
}
