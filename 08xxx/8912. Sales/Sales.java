import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j = 0; j < n; j++) a[j] = sc.nextInt();

            int cnt = 0;

            for(int j = 0; j < n; j++) {
                int num = a[j];
                for(int k = 0; k < j; k++) {
                    int compareNum = a[k];

                    if(compareNum <= num) cnt++;
                }
            }

            System.out.println(cnt);
        }
        sc.close();
    }
}
