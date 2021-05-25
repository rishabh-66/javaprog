import java.util.Scanner;

public class primefactor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int div;
        for(div = 2;div*div<=n;div++){
            while(n%div==0){
                System.out.println(div);
                n=n/div;
            }
        }
        if(n!=1)
            System.out.println(n);
    }
}
