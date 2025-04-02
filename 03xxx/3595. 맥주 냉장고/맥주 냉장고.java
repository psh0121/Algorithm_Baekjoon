import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int minValue = Integer.MAX_VALUE;
    int resA = 0;
    int resB = 0;
    int resC = 0;

    for(int a = 1; a <= n; a++) {
      if(n % a == 0) {
        for(int b = a; b <= n / a; b++) {
          if((n/a) % b == 0) {
            int c = n / (a * b);
            int value = 2 * (a*b + b*c + c*a);
            if(value < minValue) {
              minValue = value;
              resA = a;
              resB = b;
              resC = c;
            }
          }
        }
      }
    }

    System.out.printf("%d %d %d\n", resA, resB, resC);
		sc.close();
    }
}
