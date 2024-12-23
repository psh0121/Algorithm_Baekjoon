import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int x = sc.nextInt();
    int n = sc.nextInt();

    int[] possibleClass = new int[t+1];

    for(int i = 0; i < n; i++) {
      int k = sc.nextInt();

      for(int j = 0; j < k; j++) possibleClass[sc.nextInt()]++;
    }

    System.out.println(possibleClass[x] == n ? "YES" : "NO");
		sc.close();
    }
}
