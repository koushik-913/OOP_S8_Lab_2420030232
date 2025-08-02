package lab3;

public class first {

	public static void main(String[] args) {
		        String str1 = "listen";
		        String str2 = "silent";

		        if (areAnagrams(str1, str2)) {
		            System.out.println("Anagrams");
		        } else {
		            System.out.println("Not Anagrams");
		        }
		    }

		    public static boolean areAnagrams(String str1, String str2) {
		        str1 = str1.replaceAll("\\s", "").toLowerCase();
		        str2 = str2.replaceAll("\\s", "").toLowerCase();
		       if (str1.length() != str2.length()) {
		            return false;
		        }
		        int[] count1 = new int[26];
		        int[] count2 = new int[26];
		        for (int i = 0; i < str1.length(); i++) {
		            count1[str1.charAt(i) - 'a']++;
		            count2[str2.charAt(i) - 'a']++;
		        }

		        for (int i = 0; i < 26; i++) {
		            if (count1[i] != count2[i]) {
		                return false;
		            }
		        }

		        return true;
		    }
		}