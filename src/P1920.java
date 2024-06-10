import java.util.HashSet;
import java.util.Scanner;

public class P1920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt()); // 1 2 3 4 5 를 넣어줌
        }
        int m = scanner.nextInt();// 3 4 7 9 11 을 입력받는다치면
        for (int i = 0; i < m; i++) {
            if (set.contains(scanner.nextInt())) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}