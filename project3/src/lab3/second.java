
package lab3;

import java.util.*;

public class second
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int i, j, count;
        boolean found = false;

        for (i = 0; i < s.length(); i++)
        {
            count = 0;
            for (j = 0; j < s.length(); j++) 
            {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    count++;
                    break;
                }
            }
            if (count == 0)
            {
                System.out.println(s.charAt(i));
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("No non-repeating character");
    }
}
