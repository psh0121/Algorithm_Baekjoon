import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    BigInteger[] fibo = new BigInteger[491];
    fibo[1] = BigInteger.ONE;
    fibo[2] = BigInteger.ONE;
    for(int i = 3; i <= 490; i++) {
      fibo[i] = fibo[i-1].add(fibo[i-2]);
    }

    while (true) {
      int hour = sc.nextInt();
      if(hour == -1) break;

      System.out.println("Hour " + hour + ": " + fibo[hour] + " cow(s) affected");
    }
		sc.close();
    }
}
