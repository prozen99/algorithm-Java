import java.util.Scanner;

public class P27433 {
    public static long factorial(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        long t=factorial(n);
        System.out.println(t);
    }
}
