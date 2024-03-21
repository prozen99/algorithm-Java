import java.util.Scanner;

public class P1037_약수 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt(); // 약수의 개수
        int []a=new int[t];// 약수 값을 저장하기 위한 배열
        for (int i = 0; i < t; i++) {
            // 4 2 1과 자기자신 을 포함하면 1,2,4,8
            a[i]=scanner.nextInt();// 4,2 입력 한거임
            //약수 라는 것이 결국 1과 자기자신을 제외하고 최댓값과 최솟값의 곱으로 표현할 수 있음
            // 12 = 1,2,3,4,6,12 니까 2*6 으로 표현가능
            // 24= 1,2,3,4,6,8,12,24 2*12
            // 25= 1,5,25 최소 5 최대5
        }
        int max=0;
        int count=0;
        int min=a[0];
        for (int i = 0; i < t; i++) {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }

        }
        System.out.println(max*min);

    }
}
