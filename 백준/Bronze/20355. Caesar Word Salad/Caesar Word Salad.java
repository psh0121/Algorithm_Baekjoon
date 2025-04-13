import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String str = sc.next();

        int cnt = 0;

       for(int i = 0; i <= 25; i++) {
        StringBuilder sb = new StringBuilder();

        for(int j = 0; j < str.length(); j++) {
            char c = alphabet.charAt((alphabet.indexOf(Character.toString(str.charAt(j))) + i) % 26);
            sb.append(c);

            if(c == 'i') break;
        }

        if(!sb.toString().contains("i")) {
            cnt++;
        }
       }

       System.out.println(cnt == 0 ? "impossible" : cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}