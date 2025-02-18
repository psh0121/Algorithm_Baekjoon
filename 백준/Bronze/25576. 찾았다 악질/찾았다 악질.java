import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[m];
        for(int i = 0; i < m; i++) arr[i] = sc.nextInt();

        for(int i = 0; i < n-1; i++) {
            int cnt = 0;

            for(int j = 0; j < m; j++) {
                cnt += Math.abs(arr[j] - sc.nextInt());
            }

            if(cnt > 2000) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        sc.close();
    }
}
