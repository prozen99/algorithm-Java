import java.util.Scanner;

public class P11650_좌표정렬하기 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt(); // 점의 개수
        int [] x=new int[200000];
        int [] y=new int[200000];
        int t=0;


        for (int i = 0; i < n; i++) {
            x[i]=scanner.nextInt();//x
            y[i]=scanner.nextInt();//y
        }

        for (int i = 0; i < n; i++) {
            if(x[i]>x[i+1])
            {
                x[i+1]=t;
                t=x[i];
                x[i]=x[i+1];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(x[i]);
        }
    }


}
