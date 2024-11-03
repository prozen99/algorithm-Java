import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P10816_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> cardCount=new HashMap<>();
        StringTokenizer st=new StringTokenizer(br.readLine());//입력받은 문자열을 기준으로
        // 기본적으로는 공백을 기준으로 토큰화 시켜서 문자를 나눠줌

        for (int i = 0; i < n; i++) {
            int card=Integer.parseInt(st.nextToken());// Split하는것보다 효율적임
            cardCount.put(card,cardCount.getOrDefault(card,0)+1);
        }
        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine()); // 10 9 -5 2 3 4 5 -10 인상태임 !
        StringBuilder sb=new StringBuilder();
        //각 목표 카드의 개수를 HashMap에서 가져와 출력 
        for (int i = 0; i <m ; i++) {
            int target=Integer.parseInt(st.nextToken());
            sb.append(cardCount.getOrDefault(target,0)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
