import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
          sum += arr[i];
        }

        Arrays.sort(arr, (a, b) -> b - a);

        int avg = sum / n;
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
          int value = arr[i];

          if(value > avg) {
            cnt += (value - avg);
          }
        }

        System.out.println(cnt);
        sc.close();
    }
}