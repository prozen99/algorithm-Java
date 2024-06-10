import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class P18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n1=Integer.parseInt(bf.readLine());

        /*
        절사평균
        아직 아무 의견이 없다면 문제의 난이도는 0으로 결정한다.
의견이 하나 이상 있다면, 문제의 난이도는 모든 사람의 난이도 의견의 30% 절사평균으로 결정한다.

= > 절사 평균 30퍼면
 투표한 사람중 상위 15퍼  , 하위 15퍼를 제외하고 계산 하는 거임  그리고 나머지 사람들의
 값을 더해서 평균을 내는거임.
         */
        int []arr=new int[n1];
        for (int i = 0; i <n1 ; i++) {
            arr[i]=Integer.parseInt(bf.readLine());
        }
        double sum=0;
        // n * (15/100) 이고 n이 만약 20이라면 3명인거지 위3 아래3 제거 20 * (15/100)
        int k=(int)Math.round(n1*0.15); // 절사평균의 값을 넣어줌. 이 k값만큼 걸러줘야함 5*15/100 5*(3/20) 0.75 반올림
        //round는 반올림 .
        Arrays.sort(arr);
        // 20명이라 치면 k값 3 이고 0 1 2 지우고    17 18 19 를 걸러야함 .
        for (int i = k; i < n1-k; i++) {
            sum+=arr[i];//arr[3] 4 5 6 7 8 9 10 11 12 13 14 15 16 17 을 더해야함 . k부터 20-3 이라 치자
        }
        System.out.println((int)Math.round((sum/(n1-2*k))));
        bf.close();


    }
}
