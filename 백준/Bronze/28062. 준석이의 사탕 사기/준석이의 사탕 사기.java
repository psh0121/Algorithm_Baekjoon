import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int sum = 0;

    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      sum += arr[i];
    }

    if(sum % 2 == 0) System.out.println(sum);
    else {
      Arrays.sort(arr);

      for(int i = 0; i < arr.length; i++) {
        if(arr[i] % 2 == 1) {
          sum -= arr[i];
          System.out.println(sum);
          return;
        }
      }

      System.out.println(0);
    }
		sc.close();
    }
}
