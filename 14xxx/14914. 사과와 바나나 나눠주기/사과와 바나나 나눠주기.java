import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int maxCnt = Math.max(a, b);

    for(int i = 1; i <= maxCnt; i++) {
      if(a % i == 0 && b % i == 0) {
        System.out.println(i + " " + (a / i) + " " + (b / i));
      }
    }
		sc.close();
    }
}
