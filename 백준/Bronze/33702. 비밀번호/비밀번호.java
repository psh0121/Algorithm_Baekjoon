import java.util.Scanner;

public class Main {
    static int[][] keypad = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    static boolean[][] visited = new boolean[3][3];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int result = 0;

    public static void dfs (int x, int y, int cnt) {
        if(cnt == 9) {
            result++;
            return;
        }

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(
                nx >= 0 && nx < 3 &&
                ny >= 0 && ny < 3 &&
                !visited[nx][ny]
            ) {
                visited[nx][ny] = true;
                dfs(nx, ny, cnt+1);
                visited[nx][ny] = false;    // 백트래킹 - 값이 아니면 다시 취소해버림
            }
        }
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        // k의 위치가 키패드의 어느 시점에 있는지 파악
        int sx = -1;
        int sy = -1;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(keypad[i][j] == k) {
                    sx = i;
                    sy = j;
                }
            }
        }

        visited[sx][sy] = true;
        dfs(sx, sy, 1);

        System.out.println(result);

        sc.close();
    }
}