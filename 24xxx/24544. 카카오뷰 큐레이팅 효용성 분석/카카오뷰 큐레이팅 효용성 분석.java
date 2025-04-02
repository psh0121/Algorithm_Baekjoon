import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) a[i] = sc.nextInt();
    int[] b = new int[n];
    for(int i = 0; i < n; i++) b[i] = sc.nextInt();

    int sum1 = 0;
    int sum2 = 0;

    for(int i = 0; i < n; i++) {
      sum1 += a[i];

      if(b[i] == 0) sum2 += a[i];
    }

    System.out.println(sum1);
    System.out.println(sum2);
		sc.close();
    }
}
