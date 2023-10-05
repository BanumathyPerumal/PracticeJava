// package javaproject;

// public class LongestPalindromicSubString {
    
// }
package javaproject;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubString{
    static String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
    public static void main(String[] ags){
      System.out.println(longestPalindromicSubstring(s));  
    }

    public static String longestPalindromicSubstring(String s){
        String res="no longest palindrome found";
        int i = 1;
        int substring_len = s.length()-i;
        
        while(substring_len > 1){
            // System.out.println("inside while loop");
            int maxStartIndex = s.length() % substring_len == 0? s.length()/substring_len: s.length() % substring_len;
            
            // System.out.println("maxStartIndex: "+maxStartIndex);
            for(int index=0; index<=maxStartIndex; index++){
                String subString = s.substring(index, index+substring_len);
                // System.out.println("substring: " +subString);
                if(isPalindrome(subString)) {
                    // System.out.println(subString);
                    return subString;
                }
            }
            i++;
            substring_len = s.length()-i;
            // System.out.println("new substring_len: "+ substring_len);
        }
        return res;
    }

    public static List<String> getSubStrings(int substring_len, String s){
        List<String> substrings = new ArrayList();
        //code to get all the substrings of specified length
        int maxStartIndex = s.length()%substring_len;
        for(int i=0; i<=maxStartIndex; i++){
            String subString = s.substring(i);
            substrings.add(subString);
        }
        return substrings;
    }

    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            else{
            i++;
            j--;
            }
        }
        return true;
    }
}