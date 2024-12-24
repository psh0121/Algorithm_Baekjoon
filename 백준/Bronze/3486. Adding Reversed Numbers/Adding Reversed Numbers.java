import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      String n1 = new StringBuilder(sc.next()).reverse().toString();
      String n2 = new StringBuilder(sc.next()).reverse().toString();

      int sum = Integer.parseInt(n1) + Integer.parseInt(n2);

      String reverseSum = new StringBuilder(Integer.toString(sum)).reverse().toString();

      System.out.println(Integer.parseInt(reverseSum));
    }
		sc.close();
    }
}
