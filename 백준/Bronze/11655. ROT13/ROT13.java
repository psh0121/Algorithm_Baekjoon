import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String smallAlpha = "abcdefghijklmnopqrstuvwxyz";
        String bigAlpha = smallAlpha.toUpperCase();

        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c == ' ') {
                sb.append(c);
                continue;
            }

            if(smallAlpha.contains(Character.toString(c))) {
                int idx = smallAlpha.indexOf(Character.toString(c));
                idx = (idx + 13) % 26;

                sb.append(smallAlpha.charAt(idx));
            }
            else if(bigAlpha.contains(Character.toString(c))) {
                int idx = bigAlpha.indexOf(Character.toString(c));
                idx = (idx + 13) % 26;

                sb.append(bigAlpha.charAt(idx));
            }
            else sb.append(c);
        }

        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
