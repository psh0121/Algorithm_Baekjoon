import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long totalCnt = 0;
    long i = 1;
    int floor = 0;

    while (totalCnt < n) {
      long cnt = 0;

      for(int j = 1; j <= i; j+=2) {
        cnt += j;
        if(j != i) cnt += j;
      }

      totalCnt += cnt;
      i += 2;
      floor++;
    }
    
    System.out.println(n < totalCnt ? floor - 1 : floor);
		sc.close();
    }
}
