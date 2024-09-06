import java.util.Scanner;

public class P16673 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int c=scanner.nextInt();//3
        int k=scanner.nextInt();//1
        int p=scanner.nextInt();//1
        int s=0; // 합계를 둘 변수
        //  n년차 Kn+Pn^2
        //C년 동안 모은 와인의수
        for (int i = 1; i <=c; i++) {
            s=s+k*i+p*(i*i);
        }
        System.out.println(s);

    }
}
