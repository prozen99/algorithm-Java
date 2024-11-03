import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        // 봉지의 개수를 적게 가져가려면 결국 3,5 중에 5kg를 최대한 사용해야함
        int r1=n/5; //만약 18이라면  18/5 = 3봉지
        int r2=n%5; // 남은 물품의 개수
        while(r1>=0)
        {
            if(r2%3==0)
            {
                System.out.println(r1+(r2/3));
                return;
            }
            //핵심은 5kg 봉지 개수를 줄여가면서 3kg 봉지로 나누어 떨어지는지 확인해야함
            r1--;//5kg 봉지 하나를 줄이고
            r2+=5;// 그렇다면 ex) 19일경우 9로 남겨야 맞는거니까
        }
        System.out.println(-1);
    }
}
