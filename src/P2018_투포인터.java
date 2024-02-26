import java.util.*;
public class P2018_투포인터 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //투포인터의 보통 시간복잡도는 O(N) 임 .
        int n=scanner.nextInt();
        int start=1;
        int end=1;
        int sum=1;
        int count=1;//정답을 체크하기 위함인데 미리 1로 초기화하는건 n그자체 15면 15자체의 경우의수를 그냥 쓰는거임
        //배열 받을 필요없음 start 와 end 값 자체가 어차피 배열 순회하면서 얻는 값이랑 똑같으니까 굳이 할필요가없음.

        while(end!=n) //end값이 n이 아닐때까지 뭐 이미 count 1로 초기화 해놓은 경우가 있으니까 하나를 빼야함.
        {
            if(sum==n)
            {
                end++;
                count++;
                sum=sum+end;

            }
            else if(sum>n)
            {
                sum=sum-start;//
                start++;

            }
            else if(sum<n)
            {
                end++;
                sum=sum+end;
            }
        }
        System.out.println(count);

    }
}
