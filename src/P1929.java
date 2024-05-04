import java.util.Scanner;

public class P1929 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();//3
        int n2=scanner.nextInt();//16

         int []arr=new int[n2+1];// 16개 일거고
        //1먼저 소수인지 체크하자 .
        for (int i = 2; i <n2+1 ; i++) {
            //3부터 체크 해서 소수인지 보고 3,6,9,12,15,18로 가야함
            if(arr[i]==0&&i>=n1&&i<=n2)//맨 처음 값을 어떻게 해결하지? n1이 3이면 4가 안지워지니까
                //i가 4가되는거임. 4%3==1 4%2==0 4가 소수임?
            {
                System.out.println(i);
            }
            for(int j = i*2; j < n2+1; j=j+i) {
                if(j>=n1 && j<=n2)
                {
                    arr[j]=1;
                }

            }


        }







    }
}
