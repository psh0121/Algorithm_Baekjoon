import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String lowerCode = sc.nextLine().toLowerCase();
        String upperCode = lowerCode.toUpperCase();
        String str = sc.nextLine();
        sc.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if(c == ' ') {
                sb.append(' ');
                continue;
            }

            if(c == Character.toLowerCase(c)) {
                int v = c - 'a';
                sb.append(lowerCode.charAt(v));
            }
            else {
                int v = c - 'A';
                sb.append(upperCode.charAt(v));
            }
        }

        System.out.println(sb.toString().trim());
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
