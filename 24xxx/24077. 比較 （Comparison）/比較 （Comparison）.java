import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < m; i++) b[i] = sc.nextInt();

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(a[i] <= b[j]) cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}