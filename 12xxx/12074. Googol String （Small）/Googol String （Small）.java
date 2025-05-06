import java.util.Scanner;

public class Main {
    public static String calS() {
        StringBuilder sb = new StringBuilder("0");

        while (sb.length() < 100000) {
            sb.append("0");

            int lenBeforeAppend = sb.length() - 1;  // 0새로 추가되기 전 길이

            for(int i = lenBeforeAppend - 1; i >= 0; i--) {
                char c = sb.charAt(i);
                sb.append(c == '0' ? '1' : '0');
            }
        }

        return sb.toString();
    }

    public static void solve (Scanner sc) {
        String s = calS();

        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int idx = sc.nextInt() - 1;
            System.out.println("Case #" + i + ": " + s.charAt(idx));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
