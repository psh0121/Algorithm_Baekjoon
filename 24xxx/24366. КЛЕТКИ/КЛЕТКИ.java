import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();   // 비둘기장 수
        int k = sc.nextInt();   // 비둘기 수

        // n-k : 빈 비둘기 장의 수
        // k-1 : 최대 인접쌍의 수
        // (n-k) % (k-1) : 고르게 나누었을때 남는 칸 (d+1의 개수)
        // (k-1) - ((n-k) % (k-1)) : d인 개수
        System.out.println((k-1) - ((n-k) % (k-1)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}