import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P5597 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean []compare=new boolean[31];
        for (int i = 0; i <28 ; i++) {
            int n=scanner.nextInt();
            compare[n]=true;// 이렇게 바꾸면 false인게 실제 정답이
            //되는 값이니까
        }
        for (int i = 1; i <31 ; i++) {
            if(!compare[i])//원래값에서 false 인 녀석들 = 즉 mark
            {
                System.out.println(i);
            }
        }





    }
}
