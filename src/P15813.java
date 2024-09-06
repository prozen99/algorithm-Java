import java.util.Scanner;

public class P15813 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s=scanner.next();
        char []c=s.toCharArray();
        int sum=0;
        for (int i = 0; i <c.length ; i++) {
           sum+=c[i]-64;
        }
        System.out.println(sum);

    }
}
