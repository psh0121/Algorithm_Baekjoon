import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int cnt = 0;

        for(int i = 0; i < n; i++) {
          h -= arr[i];
          cnt++;

          if(h <= 0) break;
        }

        System.out.println(h <= 0 ? cnt : -1);
        sc.close();
    }
}
