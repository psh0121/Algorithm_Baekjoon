import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        // 부동소수점으로 인해 값을 int형으로 바꿔줘야한다.
        int pt = (int)Math.round(sc.nextDouble() * 100);
        double p1 = (int)Math.round(sc.nextDouble() * 100);
        double p2 = (int)Math.round(sc.nextDouble() * 100);

        StringBuilder sb = new StringBuilder();

        int i = 0;  // p1 cnt
        int j = 0;  // p2 cnt

        while (p1 * i <= pt) {
            while (p1 * i + p2 * j <= pt) {
                if(p1 * i + p2 * j == pt) {
                    sb.append(i + " " + j + "\n");
                    break;
                }

                j++;
            }
            j = 0;
            i++;
        }

        System.out.println(sb.length() == 0 ? "none" : sb.toString().trim());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
