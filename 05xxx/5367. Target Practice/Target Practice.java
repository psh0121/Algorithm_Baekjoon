import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        sb.append("|").append("-".repeat(n-2)).append("|").append("\n");

        int space = 0;

        for(int i = 0; i < (n-2)/2; i++) {
            sb.append("|");
            sb.append(" ".repeat(space));
            sb.append("*");
            sb.append(" ".repeat((n-4) - (2*space)));
            sb.append("*");
            sb.append(" ".repeat(space));
            sb.append("|");
            sb.append("\n");

            space++;
        }

        StringBuilder reverseSB = new StringBuilder(sb.toString());
        reverseSB.reverse();

        sb.append("|");
        sb.append(" ".repeat(space));
        sb.append("*");
        sb.append(" ".repeat(space));
        sb.append("|");

        sb.append(reverseSB);
        sb.append("\n");

        System.out.println(sb.toString().trim());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}