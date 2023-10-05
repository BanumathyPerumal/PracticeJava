package javaproject;

import java.util.ArrayList;
import java.util.List;

public class ImmutableString {
    
    public static void main(String[] args){
        // String str1 = "cartoon";
        // String str2 = new String();
        // str1 = str2.concat(str1);
        // System.out.println(str1);
        // String s = "  abc def\t";
        // System.out.println(s.trim().length());
        // System.out.println(repeatedString("abab"));
        String s = "aacecaaa";
        System.out.println(shortestPalindrome(s));    
    }

    
   
    static boolean repeatedString(String s){
        int len = s.length();
        List<Integer> factors = new ArrayList<>();
        //Find all the factors of len, other than len itself
            for(int i = 1; i< len; i++){
                if(len%i == 0) factors.add(i);
            }
        //For every factor, use it as end index of substring method, and find the substring	
            for(Integer factor : factors){
                int q = len/factor;
                String sub = s.substring(0,factor);
                System.out.println("sub: "+sub);
                String newStr=sub;
                for(int i=1; i<=q-1;i++){
                    newStr = newStr.concat(sub);
                }
                System.out.println("newStr: "+newStr);
                if(newStr.equals(s)) return true;
            }
        return false;	
    }
    static String shortestPalindrome(String s){
        int j=s.length()-1;
        for(int i=0; i<j; i++){
            if(s.charAt(i)==s.charAt(j)) j--;
            else{
                System.out.println(i);
                System.out.println(s.charAt(i));
                System.out.println(j);
                System.out.println(s.charAt(j));
                StringBuilder prefix = new StringBuilder(s.substring(i));
                System.out.println("returning from else");
                return prefix.reverse().toString()+s;
            } 
        }
        System.out.println("returning from outside for loop");
        return s;
    }
}
