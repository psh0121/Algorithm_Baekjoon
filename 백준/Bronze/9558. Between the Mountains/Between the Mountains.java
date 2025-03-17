import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int m = sc.nextInt();
            int[] b = new int[m];
            for(int i = 0; i < m; i++) b[i] = sc.nextInt();

            int minValue = Integer.MAX_VALUE;

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    minValue = Math.min(minValue, Math.abs(a[i] - b[j]));
                }
            }

            System.out.println(minValue);
        }
        sc.close();
    }
}