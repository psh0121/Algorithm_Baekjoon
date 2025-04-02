import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static BigInteger factorial (int num) {
    if(num <= 1) return BigInteger.ONE;
    return BigInteger.valueOf(num).multiply(factorial(num - 1));
  }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      int num = sc.nextInt();
      String factNum = factorial(num).toString();

      for(int j = factNum.length() - 1; j >= 0; j--) {
        char letter = factNum.charAt(j);
        if(letter != '0') {
          System.out.println(letter);
          break;
        }
      }
    }
		sc.close();
    }
}
