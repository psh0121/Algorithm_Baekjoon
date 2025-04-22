import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();
        int result = 0;

        while (t-- > 0) {
            String str = sc.next();
            Set<Character> set = new HashSet<>();

            for(int i = 0; i < str.length(); i++) {
                set.add(str.charAt(i));
            }

            result = Math.max(result, set.size());
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}