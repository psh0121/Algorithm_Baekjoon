import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
       while (true) {
        int n = sc.nextInt();
        if(n == -1) break;

        int[] v = new int[n];
        int totalV = 0;
        String[] name = new String[n];

        for(int i = 0; i < n; i++) {
            int tempV = sc.nextInt() * sc.nextInt() * sc.nextInt();
            v[i] = tempV;
            totalV += tempV;

            name[i] = sc.next();
        }

        int avgV = totalV / n;

        String lose = "";
        String steal = "";

        for(int i = 0; i < n; i++) {
            if(v[i] < avgV) lose = name[i];
            else if(v[i] > avgV) steal = name[i];
        }

        System.out.println(steal + " took clay from " + lose + ".");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
