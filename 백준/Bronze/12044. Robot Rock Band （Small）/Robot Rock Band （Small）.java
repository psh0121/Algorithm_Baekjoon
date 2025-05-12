import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] A = new int[n];
            int[] B = new int[n];
            int[] C = new int[n];
            int[] D = new int[n];

            for(int j = 0; j < n; j++) A[j] = sc.nextInt();
            for(int j = 0; j < n; j++) B[j] = sc.nextInt();
            for(int j = 0; j < n; j++) C[j] = sc.nextInt();
            for(int j = 0; j < n; j++) D[j] = sc.nextInt();

            int cnt = 0;

            for(int a = 0; a < n; a++) {
                for(int b = 0; b < n; b++) {
                    for(int c = 0; c < n; c++) {
                        for(int d = 0; d < n; d++) {
                            int value = A[a] ^ B[b] ^ C[c] ^ D[d];

                            if(value == k) cnt++;
                        }
                    }
                }
            }
            System.out.println("Case #" + i + ": " + cnt);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

