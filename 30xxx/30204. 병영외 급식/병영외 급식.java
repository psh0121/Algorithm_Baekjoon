import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int sum = 0;

    for(int i = 0; i < n; i++) {
      sum += sc.nextInt();
    }

    System.out.println(sum % x == 0 ? 1 : 0);
		sc.close();
    }
}
