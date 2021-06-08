import java.util.Scanner;

 class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getfactorial(n));

    }

    public static int getfactorial(int n){
        if(n==0)
            return 1;
        return n*getfactorial(n-1);
    }
}







