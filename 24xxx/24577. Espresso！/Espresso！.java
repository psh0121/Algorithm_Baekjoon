import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int s = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            String order = sc.next();
            
            if(order.length() == 1) {
                arr[i] = order.charAt(0) - '0';
            }
            else {
                arr[i] = (order.charAt(0) - '0') + 1;
            }
        }

        int cnt = 0;
        int cur = s;

        for(int i = 0; i < n; i++) {
            int need = arr[i];

            if(need > cur) {
                cur = s;
                cnt++;
            }

            cur -= arr[i];
        }

        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}