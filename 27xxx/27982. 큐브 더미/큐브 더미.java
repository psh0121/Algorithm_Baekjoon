import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m < 6) {
            System.out.println(0);
            return;
        }

        int[][] arr = new int[m][3];
        for(int i = 0; i < m; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }

        int totalCnt = 0;

        for(int i = 0; i < m; i++) {
            int cnt = 0;
            int a = arr[i][0];
            int b = arr[i][1];
            int c = arr[i][2];

            for(int j = 0; j < m; j++) {
                if(i == j) continue;

                int d = arr[j][0];
                int e = arr[j][1];
                int f = arr[j][2];

                if(Math.abs(a-d) == 1 && b==e && c==f) cnt++;
                else if(a==d && Math.abs(b-e) == 1 && c==f) cnt++;
                else if(a==d && b==e && Math.abs(c-f) == 1) cnt++;
            }

            if(cnt == 6) totalCnt++;
        }

        System.out.println(totalCnt);
        sc.close();
    }
}
