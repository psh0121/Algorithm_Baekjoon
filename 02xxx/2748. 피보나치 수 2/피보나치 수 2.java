import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        ArrayList<Long> list = new ArrayList<>();
        list.add((long)0);
        list.add((long)1);

        for(int i = 2; i <= n; i++) {
            list.add((long)list.get(list.size() - 1) + (long)list.get(list.size() - 2));
        }

        System.out.println(list.get(n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
