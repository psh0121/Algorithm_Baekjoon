import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = 1;
        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;
            int[] hi = new int[n];
            int total = 0;

            for(int i = 0; i < n; i++) {
                int cnt = sc.nextInt();
                hi[i] = cnt;
                total += cnt;
            }

            // 한기둥에 있어야할 나무블록 개수
            int needHI = total / n;

            int result = 0;

            for(int i = 0; i < n; i++) {
                if(hi[i] > needHI) {
                    result += hi[i] - needHI;
                }
            }

            System.out.println("Set #" + idx++);
            System.out.println("The minimum number of moves is " + result + ".");
            System.out.println();
        }
        sc.close();
    }
}
