import java.util.Scanner;

public class Main {
    public static String solve(Scanner sc) {
        int n = sc.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int p = sc.nextInt();
        int[] c = new int[p];
        for(int i = 0; i < p; i++) c[i] = sc.nextInt();

        sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < p; i++) {
            int cnt = 0;

            for(int j = 0; j < n; j++) {
                if(c[i] >= a[j] && c[i] <= b[j]) cnt++;
            }

            sb.append(cnt + " ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <= t; i++) {
            System.out.println("Case #" + i + ": " + solve(sc));

            if(i != t) sc.nextLine();
        }

        sc.close();
    }
}
