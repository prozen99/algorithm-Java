import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());// 이렇게 문자열만 지정해주고
        // 딱히 다른 액션을 지정해주지 않는다면 띄어쓰기를 기준으로 값을 넣어줌
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());

        // 2-1 , 2-1, 2-1, 2 << 가 되는 순간이 있음 근데 이걸 구하는 방법은
        // 일단 day 하루라는건 = A-B 이고  전체 올라가야할 높이 / 하루에 올라가는 양인데
        // 마지막에 뭐 3 +2 해서 밤이 오기전에 한번 뺄 경우를 생각하면
        //
        int day=(n-a)/(a-b); // 이게  2 1 5 의 경우에는 3일일수밖에 없고 5 1 6 의 경우에는 하루일수 밖에 없음
        //3 / 1 =3
        // 최소한 낮과 밤 하루가 도는 경우니까 그게 n-a임 3에서 낮만 지나서 2 가 와서 5가 되는 거같은
        // 날을 없애기 위해서 n-a만큼 해주는거임
        // n-a만큼 해줬기 때문에 마지막에 a만큼 더 오른 날짜 를 더해줘야함
        if((n-a)%(a-b)!=0)
        {
            day++; // 5 1 6
        }
        System.out.println(day+1);

    }
}
