import java.lang.reflect.AnnotatedArrayType;
import java.util.*;
public class P10986_구간합2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N =scanner.nextInt();//5
        int M=scanner.nextInt();//3
        long[] s=new long[N];// 합배열을 만들기 위해서
        long[] a=new long[N];
        long answer=0; //정답값을 축적해 나갈 변수 .
        long[] c=new long[M];// 마지막 경우의수를 위한 배열
        long result=0;
        s[0]=scanner.nextInt();
        for (int i = 1; i < N; i++) {
            a[i]=scanner.nextInt();
            s[i]=s[i-1]+a[i]; // 합배열 완성 ㅇㅇ
        }

        for (int i = 0; i < N; i++) {
            int reminder=(int) (s[i]%M); // 나머지값으로 인덱스 저장하기  뭐 우변의 값이 1이면 reminder가 1 아니면 0 2면 2
            //이런식으로 값을 저장하는방법이 있다
            if(reminder==0) answer++;// 정답값 추가

            c[reminder]++;// reminder는 여기서 만약 나누는수가 3이라면 0,1,2 를 의미하는 거임.
            //그럼 c[0] ++ 은 c[0] 인값을 하나 더해준다는 의미인거지 ㅇㅇ
            // c[0]
        }

        for (int i = 0; i <M ; i++) { //각 인덱스에 맞는 조합 개수 찾기.
           answer= answer+(c[i]*(c[i]-1))/2; //나머지가 같은 인덱스중 2개를 뽑는 경우의수를 찾기.
            //c[0] = 3 c[1]=2 c[2]=0 c[3]은 나올수가없음 M보다 작아야하니까.
        }
        System.out.println(answer);








    }
}
