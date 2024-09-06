import java.util.Arrays;
import java.util.Scanner;

public class P2751 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort using natural order (no need for custom comparator)
        Arrays.sort(arr);

        // Print results
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.print(sb);
    }
}
