public class Main{
public static int substringCount(String s){
    int n = s.length();
    int count = n*(n+1)/2;
    String[] substrings = new String[count];
    int index = 0;
    for(int i=0; i<n; i++){
      for(int j = i; j<n; j++){
          String substring = s.substring(i, j+1);
          substrings[index] = substring;
          index++;
      }
    }
    for(String substring: substrings) System.out.println(substring);
    return count;
}
public static void main(String[] args){
    System.out.println(substringCount("abc"));
}
}
