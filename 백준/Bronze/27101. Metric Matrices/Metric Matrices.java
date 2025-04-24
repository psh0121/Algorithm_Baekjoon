import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 규칙 1
        for(int i = 0; i < n; i++) {
            if(arr[i][i] != 0) {
                System.out.println(1);
                return;
            }
        }

        // 규칙 2
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) continue;

                if(arr[i][j] <= 0) {
                    System.out.println(2);
                    return;
                }
            }
        }

        // 규칙 3
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] != arr[j][i]) {
                    System.out.println(3);
                    return;
                }
            }
        }

        // 규칙 4
        for(int x = 0; x < n; x++) {
            for(int y = 0; y < n; y++) {
                for(int z = 0; z < n; z++) {
                    if(arr[x][y] + arr[y][z] < arr[x][z]) {
                        System.out.println(4);
                        return;
                    }
                }
            }
        }

        System.out.println(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
