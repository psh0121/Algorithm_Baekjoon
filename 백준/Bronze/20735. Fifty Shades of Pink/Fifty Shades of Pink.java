import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        while (n-- > 0) {
            String s = sc.next().toLowerCase();

            if(s.contains("pink") || s.contains("rose")) {
                list.add(s);
            }
        }

        if(list.size() == 0) {
            System.out.println("I must watch Star Wars with my daughter");
        }
        else System.out.println(list.size());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}