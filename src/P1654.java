import java.util.Arrays;
import java.util.Scanner;

public class P1654 {
    public static void main(String[] args) {
        //랜선 자르기
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();//k개의 선
        int m=scanner.nextInt();//m개의 선
        int[] arr=new int[k];
        //랜선의 길이를 이분탐색으로 찾아야함.
        for (int i = 0; i <k ; i++) {
            arr[i]=scanner.nextInt();// k=4라면 4개의 랜선의 길이
        }

        //802 743 457 539 의 값이 들어가있고
        //이 값에서 가장 길이가 길게 막대기를 뽑아서 총합이 11이 되면 종료
        long arrmax= Arrays.stream(arr).max().getAsInt();//원시타입 AS int로 최댓값구하기
        //스트림 문법이용
        long low=1;//최솟값
        long result=0;
        //이분 탐색 으로 최대 랜선 길이 찾기
        while(low<=arrmax)
        {
            long mid=(low+arrmax)/2;
            if(countcable(arr,mid)>=m)//케이블의 개수가 맞을때까지
            {
                result=mid;
                low=mid+1;
            }else{
                arrmax=mid-1;
            }
        }
        System.out.println(result);

    }

    private static long countcable(int[] arr, long length) {
        long count=0;
        for(int cable:arr)
        {
            count=count+(cable)/length;
        }
        return count;
    }
}
