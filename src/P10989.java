import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class P10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
       int N=Integer.parseInt(br.readLine());
       int [] arr=new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i]=Integer.parseInt(br.readLine()); // 입력 값을 한줄로 읽어서  정수로 변환
        }
        Arrays.sort(arr);

        for(int num:arr)
        {
            sb.append(num).append("\n");
        }
        //투포인터로 정렬하기 ? 5 2 3 1 4 2 3 5 1 7
        System.out.println(sb);

    }
}
