import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class P1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger result = BigInteger.ONE;
        for (int i = n; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i)); // int값에서의 result=result*i임
        }
        String s = result.toString();
        int count=0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }

}
