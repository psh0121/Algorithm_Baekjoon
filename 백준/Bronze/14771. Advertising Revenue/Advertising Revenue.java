import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int k = sc.nextInt();

        for(int i = 1; i <= k; i++) {
            int n = sc.nextInt();   // 광고수
            int v = sc.nextInt();   // 방문자수
            
            int[] d = new int[n+1];   // 광고종류(1:디스플레이광고, 0:클릭광고)
            int[] p = new int[n+1];   // 광고에 대해 받는 수익
            for(int j = 1; j <= n; j++) {
                d[j] = sc.nextInt();
                p[j] = sc.nextInt();
            }

            int[] a1 = new int[v];  // 방문자가 본 첫번째 광고
            int[] a2 = new int[v];  // 방문자가 본 두번쨰 광고
            int[] c = new int[v];   // 클릭한 광고정보(0:클릭안함, 1:첫번째광고클릭, 2:두번째광고클릭)
            for(int j = 0; j < v; j++) {
                a1[j] = sc.nextInt();
                a2[j] = sc.nextInt();
                c[j] = sc.nextInt();
            }

            int price = 0;

            // 수익 계산하기
            for(int j = 0; j < v; j++) {
                int click = c[j];

                if(click == 1) {
                    price += p[a1[j]];

                    if(d[a2[j]] == 1) price += p[a2[j]];
                }
                else if(click == 2) {
                    price += p[a2[j]];

                    if(d[a1[j]] == 1) price += p[a1[j]];
                }
                else {
                    if(d[a2[j]] == 1) price += p[a2[j]];
                    if(d[a1[j]] == 1) price += p[a1[j]];
                }
            }

            System.out.println("Data Set " + i + ":");
            System.out.println(price);

            if(i != k) System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}