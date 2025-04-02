import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    
    for(int i = 0; i < t; i++) {
      int n = sc.nextInt();
      int zeroCnt = 0;

      for(int j = 2; j <= n; j++) {
        int temp = n;

        // 진법 변환없이 마지막 자리가 0인지 직접 확인
        while (temp % j == 0) {
          zeroCnt++;
          temp /= j;
        }
      }

      System.out.println(zeroCnt);
    }
		sc.close();
    }
}
