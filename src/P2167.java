import java.util.Scanner;

public class P2167 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//행
        int m=scanner.nextInt();//열
        int [][]arr=new int[n+1][m+1];//1부터 사용하기 위해서
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=m ; j++) {
                arr[i][j]=scanner.nextInt();
            }
        }
        int k=scanner.nextInt();//합을 구할 부분의 개수를 써놓음
        for (int i = 0; i < k; i++) {
            int x1=scanner.nextInt();//부분합 시작 행좌표
            int y1=scanner.nextInt();//부분합 시작 열좌표
            int x2=scanner.nextInt();//부분합 시작 행좌표
            int y2=scanner.nextInt();//부분합 시작 열좌표
            //1행 3열 의 합에서 2행3열의 합을 구한다고 생각하면
            //x1 =1 y1 =3  x2 = 2 y2 =3
            int sum=0;
            for (int x = x1; x <=x2; x++) {
                for (int y = y1; y <=y2; y++) {
                    sum+=arr[x][y];
                }
            }
            System.out.println(sum);
        }
    }
}
