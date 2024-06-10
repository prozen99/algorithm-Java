import java.util.Scanner;

public class P2798 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();//
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=scanner.nextInt();
        }
        // 5 6 7 8 9 => 3개씩 뽑는 전체 경우의수
        //슬라이딩 윈도우 느낌으로 3개씩 완탐
        // 5 6 7 8 9

        int max=0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                for (int k =j+1; k <n ; k++) {
                    int sum=0;
                    sum+=arr[i]+arr[j]+arr[k];
                    if(sum>max)
                    {
                        if(sum<=m)
                        {
                            max=sum;
                        }


                    }
                }
            }
        }
        System.out.println(max);
    }
}
