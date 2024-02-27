import java.util.*;
public class P1940_주몽 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();//N
        int M=scanner.nextInt();//M


        int [] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=scanner.nextInt(); // 배열 입력받기 2 7 4 1 5 3

        }
        Arrays.sort(arr); // arr 배열 정렬 1 2 3 4 5 7 로 정렬 되어있을거임
        int startidx=0;
        int endidx=N-1; //0 부터 시작하는 inx 니까 .
        int sum=0;
        int count=0;
        while(startidx<endidx) {

            if (arr[startidx]+arr[endidx]< M) {
                startidx++;
            }
            else if (arr[startidx]+arr[endidx] == M) {
                count++;
                startidx++;
                endidx--;
            }
            else if (arr[startidx]+arr[endidx] > M) {
                endidx--;
            }
        }


        System.out.println(count);
    }
}
