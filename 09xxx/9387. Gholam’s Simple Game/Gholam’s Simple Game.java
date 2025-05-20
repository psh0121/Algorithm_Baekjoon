import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();   // 타일 개수
            int m = sc.nextInt();   // 걸음 횟수

            int[] road = new int[n];
            int curLocation = -1;   // 현재 위치
            int curDirect = -1;     // 현재 방향 (2-오른쪽, 1-왼쪽)
            for(int i = 0; i < n; i++) {
                road[i] = sc.nextInt();
                if(road[i] == 2) {
                    curLocation = i;
                    curDirect = 2;
                }
                else if(road[i] == 3) {
                    curLocation = i;
                    curDirect = 3;
                }
            }

            int cnt = 0;

            while (m-- > 0) {
                if(curDirect == 2) {
                    if(curLocation == n-1) {
                        curDirect = 3;
                        curLocation--;
                    }
                    else curLocation++;

                    if(road[curLocation] == 0) cnt++;
                }
                else {
                    if(curLocation == 0) {
                        curDirect = 2;
                        curLocation = 1;
                    }
                    else curLocation--;

                    if(road[curLocation] == 0) cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
