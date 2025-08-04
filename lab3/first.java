package lab3;
import java.util.Scanner;
public class first {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s1, s2;

	        System.out.println("Enter first String: ");
	        s1 = sc.nextLine();
	        System.out.println("Enter second String: ");
	        s2 = sc.nextLine();

	       /* s1 = s1.replaceAll("\\s", "").toLowerCase();
	        s2 = s2.replaceAll("\\s", "").toLowerCase();*/

	        if (s1.length() != s2.length()) {
	            System.out.println("Non-anagram");
	            return;
	        }

	        char[] a = s1.toCharArray();
	        char[] b = s2.toCharArray();

	 
	        for (int i = 0; i < a.length - 1; i++) {
	            for (int j = 0; j < a.length - 1 - i; j++) {
	                if (a[j] > a[j + 1]) {
	                    char temp = a[j];
	                    a[j] = a[j + 1];
	                    a[j + 1] = temp;
	                }
	            }
	        }

	        for (int i = 0; i < b.length - 1; i++) {
	            for (int j = 0; j < b.length - 1 - i; j++) {
	                if (b[j] > b[j + 1]) {
	                    char temp = b[j];
	                    b[j] = b[j + 1];
	                    b[j + 1] = temp;
	                }
	            }
	        }

	        boolean isAnagram = true;
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] != b[i]) {
	                isAnagram = false;
	                break;
	            }
	        }

	        if (isAnagram) {
	            System.out.println("Anagram");
	        } else {
	            System.out.println("Non-anagram");
	        }
		}
}
	    
