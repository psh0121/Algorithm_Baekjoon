import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String n = sc.next();
    long sum = (long)0;

    for(int i = 0; i < n.length(); i++) {
      String front = n.substring(0, n.length() - 1);
      char back = n.charAt(n.length() - 1);

      n = back + front;

      sum += Long.parseLong(n);
    }

    System.out.println(sum);

		sc.close();
    }
}
