import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

    int x = sc.nextInt();
    int y = sc.nextInt();

    Arrays.sort(arr);

    int res1 = (n * x) / 100;
    int res2 = 0;

    for(int i = 0; i < arr.length; i++) {
      if(arr[i] >= y) res2++;
    }

    System.out.println(res1 + " " + res2);
		sc.close();
    }
}
