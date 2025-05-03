import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        // 전날까지 올라가야 하는 목표: v-a
        // 하루에 올라가는 실질 거리: a-b
        // 필요한 전날 수: (v-a) / (a-b)
        int day = (int)Math.ceil((v-b) / (double)(a-b));

        System.out.println(day);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
