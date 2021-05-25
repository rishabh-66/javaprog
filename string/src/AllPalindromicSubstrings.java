import java.io.*;
import java.util.*;

public class AllPalindromicSubstrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

    public static boolean isPalindrome(String ss){
        int i=0;
        int j=ss.length()-1;
        while(i<=j){
            char c1 = ss.charAt(i);
            char c2 = ss.charAt(j);
            if(c1!=c2)
                return false;
            else{
                i++;j--;
            }

        }
        return true;
    }

    public static void solution(String str) {
        int i, j;
        for (i = 0; i < str.length(); i++) {
            for(j=i+1;j<=str.length();j++){
                String ss = str.substring(i,j);
                if(isPalindrome(ss)==true){
                    System.out.println(ss);
                }
            }

        }
    }
}
