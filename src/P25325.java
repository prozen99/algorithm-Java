import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P25325 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Map<String,Integer> strmap=new HashMap<>();
        String arr[]=new String[n];
        for (int i = 0; i <n ; i++) {
            String p=scanner.next();//학생들 이름이 뭔지 입력받음 aaa bbb ccc ddd
            arr[i]= Arrays.toString(p.split(" "));//aaa bbb ccc ddd 입력받음.
        }




    }
}
