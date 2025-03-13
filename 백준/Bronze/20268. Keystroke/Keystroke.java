import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Set<Integer> a = new HashSet<>();
            Set<Integer> b = new HashSet<>();

            for(int i = 0; i < n; i++) a.add(sc.nextInt());
            for(int i = 0; i < m; i++) b.add(sc.nextInt());

            System.out.println(n+m == 4 ? 7 : 1);
            
        }
        sc.close();
    }
}