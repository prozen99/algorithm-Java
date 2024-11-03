import java.util.Scanner;

public class SnailArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] array = new int[n][n]; // n x n 배열 생성
        boolean[][] visited = new boolean[n][n]; // 방문 체크 배열

        int[] dx = {0, 1, 0, -1}; // 행 이동 (우, 하, 좌, 상)
        int[] dy = {1, 0, -1, 0}; // 열 이동 (우, 하, 좌, 상)

        int x = 0, y = 0; // 시작 위치
        int dir = 0; // 현재 방향 인덱스
        int value = 1; // 배열에 채울 값

        for (int i = 0; i < n * n; i++) {
            array[x][y] = value++;
            visited[x][y] = true;

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 다음 위치가 배열 범위를 벗어나거나 이미 방문했을 경우 방향 전환
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || visited[nx][ny]) {
                dir = (dir + 1) % 4; // 방향 인덱스 변경
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        // 배열 출력
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf(" %2d ", array[i][j]);
            }
            System.out.println();
        }
    }
}
