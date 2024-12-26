import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    long[] day = new long[sc.nextInt() + 1];
    int m = sc.nextInt();

    for(int i = 0; i < m; i++) {
      int n = sc.nextInt();
      
      if(n == 1) {
        int p = sc.nextInt();
        long x = sc.nextLong();

        day[p] += x;
      }
      else {
        int p = sc.nextInt();
        int q = sc.nextInt();

        long sum = (long)0;

        for(int j = p; j <= q; j++) {
          sum += day[j];
        }

        System.out.println(sum);
      }
    }
		sc.close();
    }
}
