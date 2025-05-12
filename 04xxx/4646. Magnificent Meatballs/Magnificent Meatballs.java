import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;

            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[i] = a[i];
            }

            // 누적합을 계산한다
            for(int i = 1; i < n; i++) {
                a[i] += a[i-1];
            }

            for(int i = n-2; i >= 0; i--) {
                b[i] += b[i+1];
            }

            boolean found = false;

            for(int i = 1; i < n; i++) {
                if(a[i-1] == b[i]) {
                    System.out.printf("Sam stops at position %d and Ella stops at position %d.\n", i, i + 1);
                    found = true;
                    break;
                }
            }
            
            if(!found)System.out.println("No equal partitioning.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

