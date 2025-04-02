import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      int b = sc.nextInt();

      String num = Long.toString(a, b);
      String reverseNum = new StringBuilder(num).reverse().toString();

      System.out.println(num.equals(reverseNum) ? 1 : 0);
    }
		sc.close();
    }
}
