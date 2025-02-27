import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 상하좌우를 돌아가며 조건에 맞는지 확인해 볼 것
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                boolean isBest = true;  // 타켓이 최고점인가 확인

                for(int d = 0; d < 4; d++) {
                    int nx = i + dx[d];
                    int ny = j + dy[d];

                    // 범위를 벗어나지 않고 타겟칸보다 커버리면 대상이 아님
                    if(nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] >= arr[i][j]) {
                        isBest = false;
                        break;
                    }
                }

                if(isBest) cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
