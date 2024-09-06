import java.util.Scanner;

public class P10250 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();//테스트케이스
        // 테스트 케이스에서 n=10 인 경우라면


        for (int i = 0; i < t; i++) {
            int X , Y ; // x는 엘레베이터로 부터의 거리 ( 가로 ) 세로 (층수 ) 는 y
            int h=scanner.nextInt();//호텔의층수
            int w=scanner.nextInt();//호텔의 방의수
            int n=scanner.nextInt();//n번째 손님
            if (n % h == 0) { // 만약 12번째 손님의 경우에는 12%6 ==0인데
                //그게아니고 h자체가 그냥 손님의 호수임
                Y = h * 100;
                X = n / h;//엘레베이터와의 거리는 2
            }
            else {
                Y = (n % h) * 100;
                X = (n / h) + 1;
            }

             int XXYY = Y + X;	//최종 호수
            System.out.println(XXYY);
        }




    }
}
