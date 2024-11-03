import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class P1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //n번째 영화의 제목은 N번쨰로 작은 종말의 수와 같다 .
        //n= 1 666 n=2 1666 n=3 2666     0666 1666 2666 3666
        int num = 666;//모든 수를 탐색
        int count = 1;//666 부터 시작할거니까 처음에 count가 1이 되는거임
        while (count<n) {//n번째 작은수를 찾는 과정이니까 !
            num++;
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}
