import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] s = new String[n];
        String[] t = new String[m];
        for(int i = 0; i < n; i++) s[i] = sc.next();
        for(int i = 0; i < m; i++) t[i] = sc.next();

        int q = sc.nextInt();

        for(int i = 0; i < q; i++) {
            int y = sc.nextInt() - 1;
            String name = "";
            
            name += s[y % n];
            name += t[y % m];

            System.out.println(name);
        }
        sc.close();
    }
}