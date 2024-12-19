import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    // n <= 10 : 1개
    // n <= 110 : 2개
    // n <= 1110 : 3개
    // 이런식으로 규칙을 활용해 값을 알아낸다.
    int n = sc.nextInt();
    long num = 10;
    int cnt = 1;

    if(n <= 10) {}
    else {
      num = 110;
      cnt = 2;

      while (num < n) {
        num *= 10;
        cnt++;
      }
    }
    
    System.out.println(cnt);
		sc.close();
    }
}
