import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();   // cuts count of key
            int m = sc.nextInt();   // trash cuts count of key

            if(n == 0 && m == 0) break;

            int[] key = new int[n];
            for(int i = 0; i < n; i++) key[i] = sc.nextInt();

            // 재활용할수 있는 열쇠 중에 사용가능한 열쇠를 확인하다
            int cnt = 0;
            for(int i = 0; i < m; i++) {
                int[] recycleKey = new int[n];
                for(int j = 0; j < n; j++) recycleKey[j] = sc.nextInt();

                boolean isOK = true;
                for(int j = 0; j < n; j++) {
                    if(recycleKey[j] > key[j]) {
                        isOK = false;
                        break;
                    }
                }

                if(isOK) cnt++;
            }

            System.out.println(cnt);
        }
        sc.close();
    }
}