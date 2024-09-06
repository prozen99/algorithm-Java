import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class P2896 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int orange=scanner.nextInt();
        int apple=scanner.nextInt();
        int pineapple=scanner.nextInt();
        double orangeratio=scanner.nextDouble();
        double appleratio=scanner.nextDouble();
        double pineappleratio=scanner.nextDouble();
        double r1=orange/orangeratio;
        double r2=apple/appleratio;
        double r3=pineapple/pineappleratio;
        double min = Math.min(r1, Math.min(r2, r3));// 최솟값을 구하는 방법 ! 처음 배움
        //최소비율을 구했으니 이제 계산해줘야함
        double v = orange-(min*orangeratio);
        double v1=apple-(min*appleratio);
        double v2=pineapple-(min*pineappleratio);
        System.out.println(v+" "+v1+" "+v2);
    }
}
