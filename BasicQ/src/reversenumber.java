import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int digit = 0;
        while(n>0){
            int rem = n%10;
            digit = digit*10 + rem;
            n = n/10;

        }
        System.out.println(digit);
    }
}
