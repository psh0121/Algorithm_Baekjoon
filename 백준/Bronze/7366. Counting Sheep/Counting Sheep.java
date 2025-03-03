import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int m = sc.nextInt();
            int cnt = 0;
            for(int j = 0; j < m; j++) {
                String value = sc.next();

                if(value.equals("sheep")) cnt++;
            }

            System.out.println("Case " + i + ": This list contains " + cnt + " sheep.");
            if(i != n) System.out.println();
        }
        sc.close();
    }
}
