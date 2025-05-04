import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String SciComLove = "SciComLove";
        String s = sc.next();

        int cnt = 0;

        for(int i = 0; i < s.length(); i++) {
            char c1 = SciComLove.charAt(i);
            char c2 = s.charAt(i);

            if(c1 != c2) cnt++;
        }

        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
