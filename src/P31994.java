import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P31994 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        String [][]arr=new String[7][2];
        for (int i = 0; i <7 ; i++) {
            arr[i][0]=scanner.next();//문자값
            arr[i][1]=scanner.next();//숫자값
        }
        int max=0;
        int maxindex=0;//max일떄 인덱스
        for (int i = 0; i <7 ; i++) {
            if(Integer.valueOf(arr[i][1])>max)
            {
                max=Integer.parseInt(arr[i][1]);
                maxindex=i;
            }
        }

        System.out.println(arr[maxindex][0]);
    }
}
