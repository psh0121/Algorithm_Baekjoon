import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 1; i <= Math.sqrt(n); i++) {
          if(n % i == 0) {
            cnt += 2;
            
            if(i == (n / i)) {  // 곱하는 두 수가 같다면 -1
               cnt--;
            }
          }
        }

        System.out.println(cnt);
        sc.close();
    }
}