import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      long[] arr = {sc.nextLong(), sc.nextLong(), sc.nextLong()};
      Arrays.sort(arr);

      long a = arr[2];
      long b = arr[0];
      long c = arr[1];

      System.out.println(a * a + (b + c) * (b + c));
    }
		sc.close();
    }
}
