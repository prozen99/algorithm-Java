import java.util.Scanner;

public class P14647 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 행의 수
        int m = scanner.nextInt();  // 열의 수

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // 각 행과 열의 '9' 개수를 세기 위한 배열
        int[] rowCounts = new int[n];
        int[] colCounts = new int[m];

        int totalCount = 0;  // 전체 '9'의 개수를 세기 위한 변수

        // 각 행과 열에서 '9'의 개수를 세기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int count = countNines(arr[i][j]);
                rowCounts[i] += count;
                colCounts[j] += count;
                totalCount += count;
            }
        }

        // 가장 많은 '9'의 개수를 가진 행 또는 열의 '9' 개수를 찾기
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (rowCounts[i] > maxCount) {
                maxCount = rowCounts[i];
            }
        }
        for (int j = 0; j < m; j++) {
            if (colCounts[j] > maxCount) {
                maxCount = colCounts[j];
            }
        }

        // 결과 출력: 전체 '9'의 개수에서 가장 많은 '9'가 있는 행 또는 열의 '9' 개수를 뺀 값
        System.out.println(totalCount - maxCount);
    }

    // 숫자에서 '9'의 개수를 세는 함수
    private static int countNines(int num) {
        int count = 0;
        String numStr = Integer.toString(num);
        for (char c : numStr.toCharArray()) {
            if (c == '9') {
                count++;
            }
        }
        return count;
    }
}
