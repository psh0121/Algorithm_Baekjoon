import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            if(n == 0 && m == 0 && k == 0) break;

            int[] arr = new int[k];
            for(int i = 0; i < k; i++) arr[i] = sc.nextInt();

            int total = n;
            int cnt = n;
            int idx = 0;

            for(int a = 2; a <= m; a++) {
                cnt += arr[idx++];
                total += cnt;

                if(idx % k == 0) idx = 0;
            }

            System.out.println(total);
        }
        sc.close();
    }
}