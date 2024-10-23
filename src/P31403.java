import java.util.Scanner;

public class P31403 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        String a1=String.valueOf(a);
        String b1=String.valueOf(b);
        String c1=String.valueOf(c);
        System.out.println(a+b-c);
        String r1=a1+b1;
        System.out.println(Integer.parseInt(r1)-c);
    }
}
