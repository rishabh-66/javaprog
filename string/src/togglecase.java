import java.io.*;
import java.util.*;

public class togglecase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);

        for(int i=0;i<sb.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char uch = (char)(ch - 'a' + 'A') ;
                sb.setCharAt(i,uch);
            }else{
               char lch = (char)(ch - 'A' +'a') ;
                sb.setCharAt(i,lch);
            }
        }
        return sb.toString();
    }

}
