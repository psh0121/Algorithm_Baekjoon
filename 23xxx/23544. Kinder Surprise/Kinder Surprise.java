import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        Set<String> set = new HashSet<>();

        for(int i = 0; i < n; i++) set.add(sc.next());

        System.out.println(n - set.size());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}