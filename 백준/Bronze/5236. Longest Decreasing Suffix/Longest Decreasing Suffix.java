import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(s.length() - 1));

        for(int i = s.length() - 2; i >= 0; i--) {
            if(s.charAt(i) > s.charAt(i+1)) {
                sb.append(s.charAt(i));
            }
            else break;
        }

        System.out.println("The longest decreasing suffix of " + s + " is " + sb.reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}