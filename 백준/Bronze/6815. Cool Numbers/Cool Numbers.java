import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = (int)Math.sqrt(a); i <= (int)Math.sqrt(b); i++) {
            list.add(i * i);
        }

        int cnt = 0;

        for(int i = (int)Math.cbrt(a); i <= (int)Math.cbrt(b); i++) {
            if(list.contains(i * i * i)) cnt++;
        }

        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}