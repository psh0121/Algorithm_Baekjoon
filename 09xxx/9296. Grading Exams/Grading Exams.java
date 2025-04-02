import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int m = sc.nextInt();
            String val1 = sc.next();
            String val2 = sc.next();
            int wrongCnt = 0;

            for(int j = 0; j < m; j++) {
                char letter1 = val1.charAt(j);
                char letter2 = val2.charAt(j);

                if(letter1 != letter2) wrongCnt++;
            }

            System.out.println("Case " + i + ": " + wrongCnt);
        }
        sc.close();
    }
}