import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        while (true) {
            int s0 = sc.nextInt();
            int s1 = sc.nextInt();
            int r0 = sc.nextInt();
            int r1 = sc.nextInt();

            if(s0 == 0 && s1 == 0 && r0 == 0 && r1 == 0) break;

            int S = s0 > s1 ? s0 * 10 + s1 : s1 * 10 + s0;
            int R = r0 > r1 ? r0 * 10 + r1 : r1 * 10 + r0;

            if(S == 21 && R == 21) {
                System.out.println("Tie.");
                continue;
            }
            else if(S == 21) {
                System.out.println("Player 1 wins.");
                continue;
            }
            else if(R == 21) {
                System.out.println("Player 2 wins.");
                continue;
            }
            else if(S % 11 == 0 && R % 11 == 0) {
                if(S > R) System.out.println("Player 1 wins.");
                else if(S == R) System.out.println("Tie.");
                else System.out.println("Player 2 wins.");
                continue;
            }
            else if(S % 11 == 0) {
                System.out.println("Player 1 wins.");
                continue;
            }
            else if(R % 11 == 0) {
                System.out.println("Player 2 wins.");
                continue;
            }
            else if(S > R) {
                System.out.println("Player 1 wins.");
                continue;
            }
            else if(S == R) {
                System.out.println("Tie.");
                continue;
            }
            else {
                System.out.println("Player 2 wins.");
                continue;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
