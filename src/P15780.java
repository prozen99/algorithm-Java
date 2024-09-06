import java.util.Scanner;

public class P15780 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int []arr=new int[n2];
        for (int i = 0; i <n2; i++) {
            arr[i]=scanner.nextInt();
        }
        int sum=0;
        for (int i = 0; i <n2; i++) {
            int count=0;
            if(arr[i]%2==0)//값이 짝수면
            {
                count=(arr[i]/2);
                sum+=count;
            }
            if(arr[i]%2==1)//값이 홀수면
            {
                count=(arr[i]/2)+1;
                sum+=count;
            }

        }
        if(sum>=n1)
        {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
