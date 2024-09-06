import java.util.Scanner;

public class P1312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // 예: 25
        int B = scanner.nextInt(); // 예: 7
        int N = scanner.nextInt(); // 예: 5

        // 초기 나머지
        int remainder = A % B;

        // 소수점 아래 N번째 자릿수를 찾기 위해 N-1번 반복
        for (int i = 0; i < N - 1; i++) {
            remainder *= 10;
            remainder %= B;
        }

        // 마지막 나머지를 10배 하고 N번째 자릿수 계산
        remainder *= 10;
        int result = remainder / B;

        System.out.println(result);
    }

    }

