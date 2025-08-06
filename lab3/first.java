package lab3;
import java.util.*;
public class first {

		public static void main(String[] args) {
	   
        Scanner sc = new Scanner(System.in);

        String w1 = sc.nextLine();
        String w2 = sc.nextLine();

       
        char[] a = w1.toCharArray();
        char[] b = w2.toCharArray();

        
        if (a.length != b.length) 
        {
            System.out.println("Not Anagram");
            
        }

        
        Arrays.sort(a);
        Arrays.sort(b);

      
        if (Arrays.equals(a, b)) 
        {
            System.out.println("Anagram");
        } 
        else 
        {
            System.out.println("Not Anagram");
        }
    }
}

