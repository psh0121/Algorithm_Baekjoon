import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        while (true) {
            String num = sc.next();
            if(num.equals("0")) break;

            String reverseNum = new StringBuilder(num).reverse().toString();

            System.out.println(num.equals(reverseNum) ? "yes" : "no");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}