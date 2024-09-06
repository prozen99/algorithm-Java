import java.util.Scanner;

public class P1598 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int dx = 0;//떨어진 가로 거리
        int dy = 0;// 떨어진 세로 거리
        //대강 11 35 라 치면 나머지로 계산해보자
        int n1 = (n - 1) / 4;//2+1
        int n2 = (m - 1) / 4;//8+1
        int k1 = (n - 1) % 4;// 11이라 가정하면 3
        int k2 = (m - 1) % 4;// 33이라 가정하면 1

        dx = Math.abs(n1 - n2);
        dy = Math.abs(k1 - k2);

        System.out.println(dx + dy);


    }
}
