import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) set.add(sc.nextInt());

        for(int x : set) {
            if(set.contains(x+3) && set.contains(x+6)) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}