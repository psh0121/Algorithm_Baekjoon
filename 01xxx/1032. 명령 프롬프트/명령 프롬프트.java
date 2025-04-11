import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) arr[i] = sc.next();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr[0].length(); i++) {
            char c = arr[0].charAt(i);
            boolean isSame = true;

            for(int j = 1; j < n; j++) {
                char c2 = arr[j].charAt(i);

                if(c != c2) {
                    isSame = false;
                    break;
                }
            }

            if(isSame) sb.append(c);
            else sb.append('?');
        }

        System.out.println(sb.toString().trim());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}