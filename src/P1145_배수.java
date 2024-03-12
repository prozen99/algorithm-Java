import java.util.*;
public class P1145_배수 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int [] arr= new int [5];
        for (int i = 0; i < 5; i++) {
            arr[i]=scanner.nextInt();// 5개의 숫자입력
        }
        int count=0;
        int x=0;
        while(true) // 일단 숫자 무한대로 만드는거임 .
            // x(최소한의 배수 ) 를 계속 찾아야하니까.
        {
            x++;
            for (int i = 0; i < 5; i++) {
                if(x>=arr[i]&&x%arr[i]==0)
                {
                    count++;// 개수 올리고
                }


            }
            if(count>=3)//3개이상 나눠지면 무한루프 종료
            {

                break;
            }
            count=0;// 3개이상 나눠지지 않을때


        }
        System.out.println(x);
    }
}
