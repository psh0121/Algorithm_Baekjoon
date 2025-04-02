import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < n; i++) b[i] = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            int cnt = 0;

            int berry = a[i];
            int grape = b[i];

            while (berry != grape) {
                berry += p;
                grape += q;

                if(Math.abs(berry - grape) >= Math.abs(a[i] - b[i])) {
                    System.out.println("NO");
                    return;
                }

                cnt++;
            }

            arr[i] = cnt;
        }

        System.out.println("YES");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]);

            if(i != n-1) System.out.print(" ");
        }
        sc.close();
    }
}
