import java.util.*;

class decimal{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        int returnvalue=0;
        int p = 1;
        while(n>0){
            int digit = n%b;
            n = n/b;
            returnvalue += digit*p;
            p=p*10;
        }
        return returnvalue;
    }
}