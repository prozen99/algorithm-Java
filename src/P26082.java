import java.util.Scanner;

public class P26082 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        int sum=b/a; // 경쟁사 제품의 가성비
        int sum2=3*sum;//warboy의 가성비
        int result=sum2*c;
        System.out.println(result);
    }
}
