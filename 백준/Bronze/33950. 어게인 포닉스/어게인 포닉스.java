import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        
        while (n-- > 0) {
            String s = sc.next();

            System.out.println(s.replaceAll("PO", "PHO"));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
