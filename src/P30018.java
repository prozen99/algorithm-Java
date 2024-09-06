import java.util.Scanner;

public class P30018 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        int []brr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            brr[i]=scanner.nextInt();
        }
        int sum=0;
        int count=0;
        for (int i = 0; i <n ; i++) {

            if(arr[i]-brr[i]>=0)
            {
                sum+=arr[i]-brr[i];
            }
        }
        System.out.println(sum);
    }
}
