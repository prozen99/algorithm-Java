import java.util.Scanner;

public class P31654 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a+b==c)
        {
            System.out.println("correct!");
        }else if(a+b!=c)
        {
            System.out.println("wrong!");
        }
    }
}
