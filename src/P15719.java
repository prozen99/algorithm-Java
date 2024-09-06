import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P15719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long expectedSum = (long)(n - 1) * n / 2; // (1 + 2 + ... + (N-1))
        long actualSum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            actualSum += Integer.parseInt(st.nextToken());
        }

        System.out.println(actualSum - expectedSum);
    }
}
