import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];

            // 1과 2의 개수를 파악하여 2의 개수가 같아질때 멈추도록 한다
            int oneCnt = 0;
            int twoCnt = 0;

            for(int j = 0; j < n; j++) {
                int num = sc.nextInt();

                a[j] = num;

                if(num == 1) oneCnt++;
                else twoCnt++;
            }

            // 만약 twoCnt의 개수가 홀수개이면 -1
            if(twoCnt % 2 == 1) {
                System.out.println(-1);
                continue;
            }

            // 만약 twoCnt의 개수가 0이면 1
            if(twoCnt == 0) {
                System.out.println(1);
                continue;
            }

            int curTwoCnt = 0;

            for(int j = 0; j < n; j++) {
                if(a[j] == 2) {
                    curTwoCnt++;

                    if(curTwoCnt == (twoCnt - curTwoCnt)) {
                        System.out.println(j+1);
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}
