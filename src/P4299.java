import java.util.Scanner;

public class P4299 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=scanner.nextInt();//a+b
        int subtract=scanner.nextInt();//a-b


        if (sum < subtract || (sum + subtract) % 2 != 0) {
            System.out.println(-1);
        } else {
            int a = (sum + subtract) / 2;
            int b = sum - a;
            if (a >= b) {
                System.out.println(a + " " + b);
            } else {
                System.out.println(b + " " + a);
            }
        }



    }
}
