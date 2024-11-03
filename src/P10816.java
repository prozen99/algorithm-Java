import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        String[] arr = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(arr[i]);//값 하나씩 넣어주기
        }
        int m = Integer.parseInt(br.readLine());
        int[] targetNum = new int[m];
        String[] arr2 = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            targetNum[i] = Integer.parseInt(arr2[i]);
        }
        ArrayList<Integer> result=new ArrayList<>();
        // 일단 시간이 1초고 N=50만이라 N^2은 안될거같지만 
        for (int i = 0; i < m; i++) {
            int resultcount=0;
            for (int j = 0; j < n; j++) {
                if(targetNum[i]==num[j])
                {
                    resultcount++;
                }
            }
            result.add(resultcount);
        }
        for (int r:result)
        {
            System.out.print(r+" ");
        }
    }
}
