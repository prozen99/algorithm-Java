import java.util.Scanner;

public class P4344_평균 {



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt(); // test case의 개수
        int n;


        for (int i = 0; i < t; i++) {
            n=scanner.nextInt();// 값을 할당받아주기.
            int []s=new int[n];
            int sum=0;
            int count=0;
            double p=0;
            double result=0.0;

            for (int j = 0; j < n; j++) {
                s[j]=  scanner.nextInt(); //점수값 입력받기.
            }

            for (int j = 0; j < n; j++) {
                sum=sum+s[j]; //합 구해주고

            }
            result=(double)(sum/n); // 평균을 구한거임 각각
            for (int j = 0; j < n; j++) {
                if(result<s[j])
                {
                    count++; // 평균보다 높으면 값을 나눔
                }
            }
            p=(double)count/n; // 몫이 0이라 값이 제대로 안나옴 그래서 => 분수 처럼 표현해줘야해.
            //


            System.out.printf("%.3f%%\n",p*100);


        }
    }
}
