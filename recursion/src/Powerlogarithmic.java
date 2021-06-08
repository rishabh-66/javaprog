import java.util.Scanner;

class powerlogarithmic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n= scn.nextInt();
        System.out.println(power(x,n));
    }

    public  static int power(int x , int n){
        if(n==0)
            return 1;

        int pow = power(x,n/2)*power(x,n/2);

        if(n%2==1)
           pow = pow * x;
        return pow;
    }
}
