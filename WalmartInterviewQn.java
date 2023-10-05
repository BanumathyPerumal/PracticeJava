package javaproject;

import java.util.HashSet;
import java.util.Set;

public class WalmartInterviewQn {
    public static String s = "testheyesllautomation";//"ahceclionwlxoautomat";
    public static void main(String[] args){
        char[] s_characters = s.toCharArray();
        char[] hello = new char[]{'h','e','l','l','o'};
        //StringBuilder sb = new StringBuilder();

        //int i=0, j =0;
        int visitFrom = 0;
        for(int i=0; i<hello.length; i++){
            for(int j=visitFrom; j<s_characters.length; j++){
                if(hello[i]==s_characters[j]){
                    //sb.append(s_characters[j]);
                    visitFrom = j+1;
                    if(i==hello.length-1){
                        while(visitFrom < s_characters.length){
                            s_characters[visitFrom] = ' ';
                            visitFrom++;
                        }
                    }
                    break;
                }
                else{
                    s_characters[j] = ' ';
                }
            }
        }
        s = String.valueOf(s_characters);
        s = s.replaceAll(" ","");
        System.out.println(s);
        //System.out.println(sb.toString());        
    }
    
}
