import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String str = sc.next();

        int result = 1;

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c == 'T' || c == 'D' || c == 'L' || c == 'F') {
                result *= 2;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}